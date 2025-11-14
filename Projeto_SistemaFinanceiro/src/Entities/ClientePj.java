package Entities;


public class ClientePj extends Cliente {

    private String cnpj;

    public ClientePj(String nome, String cnpj) {
        super(nome, ""); // Pessoa exige CPF, mas ignoramos
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }

    @Override
    public String toString() {
        return getNome() + " (CPF/CNPJ) - " + (ativo ? "ATIVO" : "INATIVO");
    }


	public void setEndereco(String nextLine) {
		// TODO Auto-generated method stub
		
	}
}
