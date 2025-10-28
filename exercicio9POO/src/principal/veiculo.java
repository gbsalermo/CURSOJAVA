package principal;

public class veiculo {
	 protected boolean ligado;

	    public veiculo() {
	        this.ligado = false;
	    }

	    public void ligar() {
	        ligado = true;
	        System.out.println("Veículo ligado.");
	    }

	    public void desligar() {
	        ligado = false;
	        System.out.println("Veículo desligado.");
	    }

	    public void moverFrente() {
	        if (ligado)
	            System.out.println("Movendo para frente.");
	        else
	            System.out.println("Não pode se mover, veículo desligado.");
	    }

	    public void moverRe() {
	        if (ligado)
	            System.out.println("Movendo para trás.");
	        else
	            System.out.println("Não pode se mover, veículo desligado.");
	    }

	    public void parar() {
	        if (ligado)
	            System.out.println("Veículo parado.");
	        else
	            System.out.println("Veículo já está desligado.");
	    }
	}
class Automovel extends veiculo {
    private String renavam;
    private String placa;
    private boolean emMovimento;
    private int marcha;

    public Automovel(String renavam, String placa) {
        super();
        this.renavam = renavam;
        this.placa = placa;
        this.emMovimento = false;
        this.marcha = 0;
    }

    @Override
    public void moverFrente() {
        if (ligado) {
            emMovimento = true;
            System.out.println("Automóvel se move para frente.");
        } else {
            System.out.println("Automóvel desligado, não pode se mover.");
        }
    }

    @Override
    public void moverRe() {
        if (ligado) {
            emMovimento = true;
            System.out.println("Automóvel se move para trás.");
        } else {
            System.out.println("Automóvel desligado, não pode se mover.");
        }
    }

    @Override
    public void parar() {
        if (ligado) {
            emMovimento = false;
            System.out.println("Automóvel parado.");
        } else {
            System.out.println("Automóvel desligado.");
        }
    }

    public void frear() {
        if (ligado && emMovimento)
            System.out.println("Automóvel freando.");
        else
            System.out.println("Não pode frear.");
    }

    public void passarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("Automóvel desligado, não pode passar marcha.");
        } else if (!emMovimento) {
            System.out.println("Automóvel parado, não pode passar marcha.");
        } else {
            marcha = novaMarcha;
            System.out.println("Marcha alterada para: " + marcha);
        }
    }
}
class Barco extends veiculo {
    private String registroEmbarcacao;
    private boolean ancorado;

    public Barco(String registroEmbarcacao) {
        super();
        this.registroEmbarcacao = registroEmbarcacao;
        this.ancorado = true;
    }

    public void navegar() {
        if (!ligado) {
            System.out.println("Barco desligado, não pode navegar.");
        } else if (ancorado) {
            System.out.println("Barco ancorado, não pode navegar.");
        } else {
            System.out.println("Barco navegando.");
        }
    }

    public void ancorar() {
        if (!ligado) {
            System.out.println("Barco desligado, não pode ancorar.");
        } else {
            ancorado = true;
            System.out.println("Barco ancorado.");
        }
    }

    public void soltarAncora() {
        if (!ligado) {
            System.out.println("Barco desligado, não pode soltar âncora.");
        } else {
            ancorado = false;
            System.out.println("Âncora solta, barco pronto para navegar.");
        }
    }
}
class Aviao extends veiculo {
    private String registroAeronautico;
    private boolean decolado;

    public Aviao(String registroAeronautico) {
        super();
        this.registroAeronautico = registroAeronautico;
        this.decolado = false;
    }

    public void decolar() {
        if (!ligado) {
            System.out.println("Avião desligado, não pode decolar.");
        } else if (!decolado) {
            decolado = true;
            System.out.println("Avião decolou.");
        } else {
            System.out.println("Avião já está no ar.");
        }
    }

    public void pousar() {
        if (!ligado) {
            System.out.println("Avião desligado, não pode pousar.");
        } else if (!decolado) {
            System.out.println("Avião ainda não decolou, não pode pousar.");
        } else {
            decolado = false;
            System.out.println("Avião pousou.");
        }
    }
}

