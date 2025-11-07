package Exercicio_1;

class Monitor implements DispositivoIO {
    public void escrever(String mensagem) {
        System.out.println("MONITOR: Exibindo na tela -> " + mensagem);
    }
    public String ler() {
        return "Nenhuma entrada do monitor.";
    }
}