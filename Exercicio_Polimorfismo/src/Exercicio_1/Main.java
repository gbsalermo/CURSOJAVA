package Exercicio_1;

public class Main {
    static void enviar_dados(DispositivoIO dispositivo, String dados) {
        dispositivo.escrever(dados);
        System.out.println(dispositivo.ler());
    }

    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        Monitor monitor = new Monitor();

        enviar_dados(impressora, "Documento de teste");
        enviar_dados(monitor, "Mensagem na tela");
    }
}