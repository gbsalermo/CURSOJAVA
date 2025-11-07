package Exercicio_2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(2000);

        Conta[] contas = {cc, cp};

        for (Conta c : contas) {
            c.aplicarJuros();
        }

        double total = cc.somar(cp);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
        System.out.println("Soma dos saldos: " + total);
    }
}
