package Exercicio_2;

class ContaCorrente extends Conta {
    double limite = 500.0;

    ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            if (saldo < 0) {
                System.out.println("Aviso: Usando o limite da conta.");
            }
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void depositar(double valor) {
        saldo += valor;
    }

    void aplicarJuros() {
    }
}