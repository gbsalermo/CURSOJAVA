package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Cliente extends Pessoa {

	protected boolean ativo = true;
	protected String endereco;
	protected LocalDate dataNascimento;
    private ArrayList<Conta> contas;
	private ArrayList Conta;

    public Cliente(String nome, String identificador) {
        super(nome, identificador);
        this.Conta = new ArrayList<>();
    }
    
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String e) { this.endereco = e; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate d) { this.dataNascimento = d; }

    
    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public abstract String getIdentificador(); // CPF ou CNPJ

    @Override
    public abstract String toString();
}

