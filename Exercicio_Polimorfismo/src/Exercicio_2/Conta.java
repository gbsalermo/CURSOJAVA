package Exercicio_2;

abstract class Conta {
    double saldo;

    Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    abstract void sacar(double valor);
    abstract void depositar(double valor);
    abstract void aplicarJuros();

    public double getSaldo() {
        return saldo;
    }

    public double somar(Conta outraConta) {
        return this.saldo + outraConta.saldo;
    }
}