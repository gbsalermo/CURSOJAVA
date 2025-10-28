package principal;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Paciente ===");
        System.out.print("Nome do paciente: ");
        String nomePaciente = sc.nextLine();
        System.out.print("CPF do paciente: ");
        String cpfPaciente = sc.nextLine();
        System.out.print("Telefone do paciente: ");
        String telefone = sc.nextLine();

        Paciente paciente = new Paciente(nomePaciente, cpfPaciente, telefone);

        System.out.println("\n=== Cadastro de Médico ===");
        System.out.print("Nome do médico: ");
        String nomeMedico = sc.nextLine();
        System.out.print("CPF do médico: ");
        String cpfMedico = sc.nextLine();
        System.out.print("CRM do médico: ");
        String crm = sc.nextLine();

        Medico medico = new Medico(nomeMedico, cpfMedico, crm);

        System.out.print("Quantas especialidades o médico possui? ");
        int qtdEsp = sc.nextInt();
        sc.nextLine(); // limpar buffer
        for (int i = 0; i < qtdEsp; i++) {
            System.out.print("Nome da especialidade " + (i + 1) + ": ");
            String nomeEsp = sc.nextLine();
            medico.adicionarEspecialidade(new Especialidade(nomeEsp));
        }

        System.out.println("\n=== Cadastro do Plano de Saúde ===");
        System.out.print("CNPJ do plano: ");
        String cnpj = sc.nextLine();

        PlanoSaude plano = new PlanoSaude(cnpj);

        Consulta consulta = new Consulta(paciente, plano, medico);
        System.out.println("\n=== Resumo da Consulta ===");
        consulta.exibirDetalhes();
    }}

