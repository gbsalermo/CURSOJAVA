package Entities;


public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente titular, String senha) {
        super(numero, titular, senha);
    }

    public void renderJuros(double taxa) {
        double rendimento = saldo * taxa;
        saldo += rendimento;
        movimentos.add(new Movimento("Rendimento", rendimento));
    }
}
