package Entities;


import java.util.ArrayList;

public abstract class Conta {
	protected boolean ativa = true;
	protected String senha;
    protected int numero;
    protected double saldo;
    protected Cliente titular;
    protected ArrayList<Movimento> movimentos;

    public Conta(int numero, Cliente titular, String senha) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.senha = senha;
        this.ativa = true;
        this.movimentos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        movimentos.add(new Movimento("Depósito", valor));
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            movimentos.add(new Movimento("Saque", valor));
            return true;
        }
        return false;
    }

    public void emitirExtrato() {
        System.out.println("\nExtrato da conta " + numero + " (" + titular.getNome() + "):");
        for (Movimento m : movimentos) {
            System.out.println(m);
        }
        System.out.println("Saldo atual: R$ " + saldo);
    }

public boolean isAtiva() { return ativa; }
public void setAtiva(boolean ativa) { this.ativa = ativa; }

public String getSenha() { return senha; }
public void setSenha(String senha) { this.senha = senha; }

public ArrayList<Movimento> getMovimentos() {
    return movimentos;
}}


