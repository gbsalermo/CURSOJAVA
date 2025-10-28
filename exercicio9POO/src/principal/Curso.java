package principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Curso {
    private String nome;
    private double cargaHoraria;
    private String conteudoProgramatico;
    private double valor;

    private List<Turma> turmas = new ArrayList<>();

    public Curso(String nome, double cargaHoraria, String conteudoProgramatico, double valor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.conteudoProgramatico = conteudoProgramatico;
        this.valor = valor;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(double cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    public String getConteudoProgramatico() { return conteudoProgramatico; }
    public void setConteudoProgramatico(String conteudoProgramatico) { this.conteudoProgramatico = conteudoProgramatico; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public List<Turma> getTurmas() { return turmas; }
    public void adicionarTurma(Turma t) { turmas.add(t); }
}
class Turma {
    private Date dataInicio;
    private Date dataTermino;
    private String horarioInicio;
    private String horarioTermino;

    private Curso curso;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(Date dataInicio, Date dataTermino, String horarioInicio, String horarioTermino, Curso curso, Professor professor) {
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.curso = curso;
        this.professor = professor;
    }

    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date dataInicio) { this.dataInicio = dataInicio; }

    public Date getDataTermino() { return dataTermino; }
    public void setDataTermino(Date dataTermino) { this.dataTermino = dataTermino; }

    public String getHorarioInicio() { return horarioInicio; }
    public void setHorarioInicio(String horarioInicio) { this.horarioInicio = horarioInicio; }

    public String getHorarioTermino() { return horarioTermino; }
    public void setHorarioTermino(String horarioTermino) { this.horarioTermino = horarioTermino; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public void adicionarAluno(Aluno a) { alunos.add(a); }
    public List<Aluno> getAlunos() { return alunos; }
}
class Professor {
    private String nome;
    private String telefone;
    private double valorHoraAula;

    public Professor(String nome, String telefone, double valorHoraAula) {
        this.nome = nome;
        this.telefone = telefone;
        this.valorHoraAula = valorHoraAula;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public double getValorHoraAula() { return valorHoraAula; }
    public void setValorHoraAula(double valorHoraAula) { this.valorHoraAula = valorHoraAula; }
}
class Aluno {
    private String nome;
    private String identidade;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(String nome, String identidade, String cpf, Date dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.identidade = identidade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getIdentidade() { return identidade; }
    public void setIdentidade(String identidade) { this.identidade = identidade; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public Date getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(Date dataNascimento) { this.dataNascimento = dataNascimento; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public List<Telefone> getTelefones() { return telefones; }
    public void adicionarTelefone(Telefone telefone) { telefones.add(telefone); }
}
class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;

    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String cep, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
    }

    public String getLogradouro() { return logradouro; }
    public String getNumero() { return numero; }
    public String getComplemento() { return complemento; }
    public String getBairro() { return bairro; }
    public String getCidade() { return cidade; }
    public String getCep() { return cep; }
    public String getUf() { return uf; }
}
class Telefone {
    private String ddd;
    private String numero;
    private String tipo;

    public Telefone(String ddd, String numero, String tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getDdd() { return ddd; }
    public String getNumero() { return numero; }
    public String getTipo() { return tipo; }
}
class Matricula {
    private Date data;
    private double valorPago;
    private Aluno aluno;
    private Turma turma;

    public Matricula(Date data, double valorPago, Aluno aluno, Turma turma) {
        this.data = data;
        this.valorPago = valorPago;
        this.aluno = aluno;
        this.turma = turma;
    }

    public Date getData() { return data; }
    public double getValorPago() { return valorPago; }
    public Aluno getAluno() { return aluno; }
    public Turma getTurma() { return turma; }
}

