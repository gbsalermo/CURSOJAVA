package Entities;


public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, Cliente titular, String senha, double limite) {
        super(numero, titular, senha);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            movimentos.add(new Movimento("Saque (especial)", valor));
            return true;
        }
        return false;
    }
}
