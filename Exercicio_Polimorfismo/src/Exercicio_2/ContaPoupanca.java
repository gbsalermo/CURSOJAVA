package Exercicio_2;

class ContaPoupanca extends Conta {

    ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void depositar(double valor) {
        saldo += valor;
    }

    void aplicarJuros() {
        saldo += saldo * 0.005;
    }
}
