package Entities;



public class ClientePf extends Cliente {


	public ClientePf(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String getIdentificador() {
        return getCpf(); // da classe Pessoa
    }

    @Override
    public String toString() {
        return getNome() + " (CPF/CNPJ) - " + (ativo ? "ATIVO" : "INATIVO");
    }

}
