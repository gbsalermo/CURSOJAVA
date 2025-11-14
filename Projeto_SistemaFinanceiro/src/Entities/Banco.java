package Entities;


import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        System.out.println("=== Clientes Cadastrados ===");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
    public Cliente buscarClientePorId(String id) {
        for (Cliente c : clientes) {
            if (c.getIdentificador().equals(id)) return c;
        }
        return null;
    }
    public Conta buscarContaPorNumero(int numero) {
        for (Cliente c : clientes) {
            for (Conta conta : c.getContas()) {
                if (conta.getNumero() == numero) return conta;
            }
        }
        return null;
    }

}
