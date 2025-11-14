package Entities;


//interface com todos os casos de uso

import java.util.Scanner;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class InterfaceMain {
    private Banco banco;
    private Scanner sc = new Scanner(System.in);

    public InterfaceMain(Banco banco) {
        this.banco = banco;
    }

    public void iniciar() {
        int op;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Abrir Conta Comum");
            System.out.println("2 - Abrir Conta Poupança");
            System.out.println("3 - Abrir Conta Especial");
            System.out.println("4 - Realizar Depósito");
            System.out.println("5 - Realizar Saque");
            System.out.println("6 - Emitir Saldo");
            System.out.println("7 - Emitir Extrato");
            System.out.println("8 - Registrar Movimento");
            System.out.println("9 - Gerenciar Clientes");
            System.out.println("10 - Listar Clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> abrirContaComum();
                case 2 -> abrirContaPoupanca();
                case 3 -> abrirContaEspecial(); // já com regras
                case 4 -> realizarDeposito();
                case 5 -> realizarSaque();
                case 6 -> emitirSaldo();
                case 7 -> emitirExtrato();
                case 8 -> registrarMovimento();
                case 9 -> gerenciarClientes();
                case 10 -> banco.listarClientes();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (op != 0);
    }

    // ---------- utilitários ----------
    private boolean validarCpfCnpj(String id) {
        if (id == null) return false;
        String dig = id.replaceAll("\\D", "");
        return dig.length() == 11 || dig.length() == 14;
    }

    private Cliente pedirDadosBasicosCliente(boolean obrigarNascimentoEndereco) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Tipo (1-PF, 2-PJ): ");
        int tipo = sc.nextInt();
        sc.nextLine();
        String id;
        if (tipo == 1) {
            System.out.print("CPF: ");
            id = sc.nextLine();
            if (!validarCpfCnpj(id)) {
                System.out.println("CPF inválido.");
                return null;
            }
            ClientePf c = new ClientePf(nome, id);
            if (obrigarNascimentoEndereco) {
                System.out.print("Endereço: ");
                c.setEndereco(sc.nextLine());
                System.out.print("Data de nascimento (yyyy-MM-dd): ");
                try {
                    LocalDate d = LocalDate.parse(sc.nextLine());
                    c.setDataNascimento(d);
                } catch (DateTimeParseException ex) {
                    System.out.println("Data inválida.");
                    return null;
                }
            }
            return c;
        } else if (tipo == 2) {
            System.out.print("CNPJ: ");
            id = sc.nextLine();
            if (!validarCpfCnpj(id)) {
                System.out.println("CNPJ inválido.");
                return null;
            }
            ClientePj c = new ClientePj(nome, id);
            if (obrigarNascimentoEndereco) {
                System.out.print("Endereço: ");
                c.setEndereco(sc.nextLine());
 
            }
            return c;
        } else {
            System.out.println("Tipo inválido.");
            return null;
        }
    }

    private Conta pedirContaAtivaPorNumero() {
        System.out.print("Número da conta: ");
        int num = sc.nextInt();
        sc.nextLine();
        Conta c = banco.buscarContaPorNumero(num);
        if (c == null) {
            System.out.println("Conta não encontrada.");
            return null;
        }
        if (!c.isAtiva()) {
            System.out.println("Conta inativa.");
            return null;
        }
        return c;
    }

    // ---------- casos de uso ----------
    private void abrirContaComum() {
        System.out.println("\n=== Abrir Conta Comum ===");
        System.out.println("Dados do cliente:");
        System.out.println("Se o cliente já existe, informe o CPF/CNPJ para vinculá-lo.");
        System.out.print("Deseja vincular a um cliente existente? (1-Sim / 2-Não): ");
        int opt = sc.nextInt(); sc.nextLine();

        Cliente cliente = null;
        if (opt == 1) {
            System.out.print("CPF/CNPJ: ");
            String id = sc.nextLine();
            if (!validarCpfCnpj(id)) {
                System.out.println("ID inválido.");
                return;
            }
            cliente = banco.buscarClientePorId(id);
            if (cliente == null) {
                System.out.println("Cliente não encontrado.");
                return;
            }
        } else {

            cliente = pedirDadosBasicosCliente(true);
            if (cliente == null) return;
            banco.adicionarCliente(cliente);
            System.out.println("Cliente cadastrado.");
        }

        System.out.print("Número da conta: ");
        int numero = sc.nextInt(); sc.nextLine();
        System.out.print("Senha da conta (numérica): ");
        String senha = sc.nextLine();

        ContaComum conta = new ContaComum(numero, cliente, senha);
        cliente.adicionarConta(conta);
        System.out.println("Conta comum criada com sucesso. Depósito inicial não obrigatório.");
    }

    private void abrirContaPoupanca() {
        System.out.println("\n=== Abrir Conta Poupança ===");
        abrirContaComum(); 
        System.out.println("Se for poupança, troque a conta criada manualmente se desejado.");
    
    }

    private void abrirContaEspecial() {
        System.out.println("\n=== Abrir Conta Especial ===");
       
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt(); sc.nextLine();
        if (idade < 18) { System.out.println("Cliente menor de idade. Operação cancelada."); return; }

        System.out.print("Tipo (1-PF,2-PJ): ");
        int tipo = sc.nextInt(); sc.nextLine();

        String id;
        Cliente cliente;
        if (tipo == 1) {
            System.out.print("CPF: "); id = sc.nextLine();
            if (!validarCpfCnpj(id)) { System.out.println("CPF inválido."); return; }
            cliente = banco.buscarClientePorId(id);
            if (cliente == null) {
                cliente = new ClientePf(nome, id);
                banco.adicionarCliente(cliente);
            }
        } else {
            System.out.print("CNPJ: "); id = sc.nextLine();
            if (!validarCpfCnpj(id)) { System.out.println("CNPJ inválido."); return; }
            cliente = banco.buscarClientePorId(id);
            if (cliente == null) {
                cliente = new ClientePj(nome, id);
                banco.adicionarCliente(cliente);
            }
        }

        System.out.print("O cliente está empregado? (1-Sim / 2-Não): ");
        int empregado = sc.nextInt(); sc.nextLine();
        if (empregado != 1) { System.out.println("Cliente não empregado. Operação cancelada."); return; }

        System.out.print("Informe salário mensal (R$): ");
        double salario = sc.nextDouble(); sc.nextLine();
        if (salario < 1500) { System.out.println("Salário insuficiente. Operação cancelada."); return; }

        System.out.println("Funcionário: aprovar pedido? 1-Aprovar 2-Rejeitar");
        int apro = sc.nextInt(); sc.nextLine();
        if (apro != 1) { System.out.println("Pedido rejeitado."); return; }

        System.out.print("Depósito inicial (mínimo R$50): ");
        double deposito = sc.nextDouble(); sc.nextLine();
        if (deposito < 50) { System.out.println("Depósito insuficiente. Operação cancelada."); return; }

        System.out.print("Número da conta: ");
        int numero = sc.nextInt(); sc.nextLine();
        System.out.print("Senha da conta: ");
        String senha = sc.nextLine();
        System.out.print("Limite especial (R$): ");
        double limite = sc.nextDouble(); sc.nextLine();

        ContaEspecial conta = new ContaEspecial(numero, cliente, senha, limite);
        cliente.adicionarConta(conta);
        conta.depositar(deposito);

        System.out.println("Conta especial criada com sucesso. Nº " + numero + ", saldo R$ " + conta.getSaldo());
    }

    private void realizarDeposito() {
        System.out.println("\n=== Realizar Depósito ===");
        Conta c = pedirContaAtivaPorNumero();
        if (c == null) return;
        System.out.print("Valor a depositar: R$ ");
        double v = sc.nextDouble(); sc.nextLine();
        if (v <= 0) { System.out.println("Valor inválido."); return; }
        c.depositar(v);
        System.out.println("Depósito realizado com sucesso. Saldo: R$ " + c.getSaldo());
    }

    private void realizarSaque() {
        System.out.println("\n=== Realizar Saque ===");
        Conta c = pedirContaAtivaPorNumero();
        if (c == null) return;
        System.out.print("Senha: ");
        String s = sc.nextLine();
        if (!c.getSenha().equals(s)) { System.out.println("Senha inválida."); return; }
        System.out.print("Valor a sacar: R$ ");
        double v = sc.nextDouble(); sc.nextLine();
        boolean ok = c.sacar(v);
        if (ok) System.out.println("Saque realizado. Entregue R$ " + v);
        else System.out.println("Saldo insuficiente.");
    }

    private void emitirSaldo() {
        System.out.println("\n=== Emitir Saldo ===");
        Conta c = pedirContaAtivaPorNumero();
        if (c == null) return;
        System.out.print("Senha: ");
        String s = sc.nextLine();
        if (!c.getSenha().equals(s)) { System.out.println("Senha inválida."); return; }
        System.out.println("Saldo atual: R$ " + c.getSaldo());
    }

    private void emitirExtrato() {
        System.out.println("\n=== Emitir Extrato ===");
        Conta c = pedirContaAtivaPorNumero();
        if (c == null) return;
        System.out.print("Senha: ");
        String s = sc.nextLine();
        if (!c.getSenha().equals(s)) { System.out.println("Senha inválida."); return; }

        System.out.print("Data início (yyyy-MM-dd): ");
        String in = sc.nextLine();
        System.out.print("Data fim (yyyy-MM-dd): ");
        String fi = sc.nextLine();

        LocalDateTime inicio, fim;
        try {
            inicio = LocalDate.parse(in).atStartOfDay();
            fim = LocalDate.parse(fi).atTime(23,59,59);
            if (inicio.isAfter(fim)) { System.out.println("Período inválido."); return; }
        } catch (DateTimeParseException ex) {
            System.out.println("Data inválida."); return;
        }

        System.out.println("\nExtrato do período:");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (Movimento m : c.getMovimentos()) {
            if (!m.getData().isBefore(inicio) && !m.getData().isAfter(fim)) {
                System.out.println(m);
            }
        }
    }

    private void registrarMovimento() {
        System.out.println("\n=== Registrar Movimento (manual) ===");
        System.out.print("Número da conta: ");
        int num = sc.nextInt(); sc.nextLine();
        Conta c = banco.buscarContaPorNumero(num);
        if (c == null) { System.out.println("Conta não encontrada."); return; }
        System.out.print("Tipo (1-Depósito 2-Saque): ");
        int t = sc.nextInt(); sc.nextLine();
        System.out.print("Valor: R$ ");
        double v = sc.nextDouble(); sc.nextLine();
        if (t == 1) {
            c.depositar(v);
            System.out.println("Depósito registrado.");
        } else {
            if (c.sacar(v)) System.out.println("Saque registrado.");
            else System.out.println("Saldo insuficiente.");
        }
    }

    private void gerenciarClientes() {
        System.out.println("\n=== Gerenciar Clientes ===");
        System.out.println("1 - Consultar cliente");
        System.out.println("2 - Incluir cliente");
        System.out.println("3 - Alterar cliente");
        System.out.println("4 - Inativar cliente");
        System.out.print("Escolha: ");
        int op = sc.nextInt(); sc.nextLine();

        switch (op) {
            case 1 -> {
                System.out.print("CPF/CNPJ: ");
                String id = sc.nextLine();
                if (!validarCpfCnpj(id)) { System.out.println("ID inválido."); return; }
                Cliente c = banco.buscarClientePorId(id);
                if (c == null) { System.out.println("Cliente não encontrado."); return; }
                System.out.println("Dados: " + c.toString());
                System.out.println("Endereço: " + c.getEndereco());
                System.out.println("Contas:");
                for (Conta ct : c.getContas()) System.out.println(" - Conta " + ct.getNumero() + " (Saldo R$ " + ct.getSaldo() + ")");
            }
            case 2 -> {
                System.out.println("Incluir cliente:");
                Cliente c = pedirDadosBasicosCliente(true);
                if (c == null) return;
                banco.adicionarCliente(c);
                System.out.println("Cliente cadastrado.");
            }
            case 3 -> {
                System.out.print("CPF/CNPJ do cliente a alterar: ");
                String id = sc.nextLine();
                if (!validarCpfCnpj(id)) { System.out.println("ID inválido."); return; }
                Cliente c = banco.buscarClientePorId(id);
                if (c == null) { System.out.println("Cliente não encontrado."); return; }
                System.out.print("Novo nome (enter para manter): ");
                String n = sc.nextLine();
                if (!n.isBlank()) {
                    System.out.println("Alteração de nome não implementada. (Adicione setNome em Pessoa se desejar.)");
                }
                System.out.print("Novo endereço (enter para manter): ");
                String end = sc.nextLine();
                if (!end.isBlank()) c.setEndereco(end);
                System.out.println("Alterações registradas.");
            }
            case 4 -> {
                System.out.print("CPF/CNPJ do cliente a inativar: ");
                String id = sc.nextLine();
                if (!validarCpfCnpj(id)) { System.out.println("ID inválido."); return; }
                Cliente c = banco.buscarClientePorId(id);
                if (c == null) { System.out.println("Cliente não encontrado."); return; }
                c.setAtivo(false);
                System.out.println("Cliente inativado.");
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}


