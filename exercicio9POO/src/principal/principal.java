package principal;

import java.util.Date;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Aluno ===");
        System.out.print("Nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Matrícula do aluno: ");
        String matriculaAluno = sc.nextLine();

        System.out.print("CPF do aluno: ");
        String cpfAluno = sc.nextLine();

        System.out.println("\n=== Endereço do Aluno ===");
        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Número: ");
        String numero = sc.nextLine();

        System.out.print("Complemento: ");
        String complemento = sc.nextLine();

        System.out.print("Bairro: ");
        String bairro = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        Endereco end = new Endereco(rua, numero, complemento, bairro, cidade, cep, estado);

        Aluno aluno = new Aluno(nomeAluno, matriculaAluno, cpfAluno, new Date(), end);

        System.out.println("\n=== Telefone do Aluno ===");
        System.out.print("DDD: ");
        String ddd = sc.nextLine();
        System.out.print("Número: ");
        String numeroTel = sc.nextLine();
        System.out.print("Tipo (celular/fixo): ");
        String tipo = sc.nextLine();

        aluno.adicionarTelefone(new Telefone(ddd, numeroTel, tipo));

        System.out.println("\n=== Cadastro de Professor ===");
        System.out.print("Nome do professor: ");
        String nomeProf = sc.nextLine();

        System.out.print("Telefone do professor: ");
        String telefoneProf = sc.nextLine();

        System.out.print("Valor da hora aula (R$): ");
        double valorHora = sc.nextDouble();
        sc.nextLine(); // limpa buffer

        Professor prof = new Professor(nomeProf, telefoneProf, valorHora);

        System.out.println("\n=== Cadastro de Curso ===");
        System.out.print("Nome do curso: ");
        String nomeCurso = sc.nextLine();

        System.out.print("Carga horária (em horas): ");
        int cargaHoraria = sc.nextInt();
        sc.nextLine(); // limpa buffer

        System.out.print("Conteúdo programático: ");
        String conteudo = sc.nextLine();

        System.out.print("Valor do curso (R$): ");
        double valorCurso = sc.nextDouble();
        sc.nextLine(); // limpa buffer

        Curso curso = new Curso(nomeCurso, cargaHoraria, conteudo, valorCurso);

        System.out.println("\n=== Cadastro de Turma ===");
        System.out.print("Horário de início: ");
        String horaInicio = sc.nextLine();
        System.out.print("Horário de término: ");
        String horaFim = sc.nextLine();

        Turma turma = new Turma(new Date(), new Date(), horaInicio, horaFim, curso, prof);
        turma.adicionarAluno(aluno);

        System.out.println("\n=== Matrícula ===");
        System.out.print("Valor pago (R$): ");
        double valorPago = sc.nextDouble();
        sc.nextLine();

        Matricula matricula = new Matricula(new Date(), valorPago, aluno, turma);

        System.out.println("\n=== Confirmação da Matrícula ===");
        System.out.println("Aluno matriculado: " + aluno.getNome());
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Professor: " + prof.getNome());
        System.out.println("Valor pago: R$" + matricula.getValorPago());

        sc.close();
    }
}
