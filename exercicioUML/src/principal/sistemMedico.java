package principal;

	import java.util.List;
	import java.util.ArrayList;

	class Pessoa {
	    protected String nome;
	    protected String cpf;

	    public Pessoa(String nome, String cpf) {
	        this.nome = nome;
	        this.cpf = cpf;
	    }
	}

	class Paciente extends Pessoa {
	    private String telefone;

	    public Paciente(String nome, String cpf, String telefone) {
	        super(nome, cpf);
	        this.telefone = telefone;
	    }

	    @Override
	    public String toString() {
	        return "Paciente: " + nome + " (CPF: " + cpf + ", Telefone: " + telefone + ")";
	    }
	}

	class Medico extends Pessoa {
	    private String crm;
	    private List<Especialidade> especialidades;

	    public Medico(String nome, String cpf, String crm) {
	        super(nome, cpf);
	        this.crm = crm;
	        this.especialidades = new ArrayList<>();
	    }

	    public void adicionarEspecialidade(Especialidade e) {
	        especialidades.add(e);
	    }

	    public List<Especialidade> getEspecialidades() {
	        return especialidades;
	    }

	    public String getCrm() {
	        return crm;
	    }
	}

	class Especialidade {
	    private String nome;

	    public Especialidade(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }
	}

	class PlanoSaude {
	    private String cnpj;

	    public PlanoSaude(String cnpj) {
	        this.cnpj = cnpj;
	    }

	    public String getCnpj() {
	        return cnpj;
	    }
	}

	class Consulta {
	    private Paciente paciente;
	    private PlanoSaude plano;
	    private Medico medico;

	    public Consulta(Paciente paciente, PlanoSaude plano, Medico medico) {
	        this.paciente = paciente;
	        this.plano = plano;
	        this.medico = medico;
	    }

	    public void exibirDetalhes() {
	        System.out.println("=== Consulta ===");
	        System.out.println(paciente.toString());
	        System.out.println("Médico: " + medico.nome + " (CRM: " + medico.getCrm() + ")");
	        System.out.println("Plano de Saúde: " + plano.getCnpj());
	        System.out.println("Especialidades do médico:");
	        for (Especialidade e : medico.getEspecialidades()) {
	            System.out.println("- " + e.getNome());
	        }
	        System.out.println("=================");
	    }
	}


