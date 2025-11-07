package Exercicio_1;

class Impressora implements DispositivoIO {
    public void escrever(String mensagem) {
        System.out.println("IMPRESSORA: Imprimindo -> " + mensagem);
    }
    public String ler() {
        return "Nenhuma entrada da impressora.";
    }
}