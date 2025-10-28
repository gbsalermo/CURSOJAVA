package principal;

public interface Principal_veiculo {
	public static void main(String[] args) {
		
        Automovel carro = new Automovel("123456789", "ABC-1234");
        Barco barco = new Barco("BR-9876");
        Aviao aviao = new Aviao("AR-54321");

        // Testando Automóvel
        carro.ligar();
        carro.moverFrente();
        carro.passarMarcha(2);
        carro.frear();
        carro.parar();
        carro.desligar();

        System.out.println();

        // Testando Barco
        barco.ligar();
        barco.soltarAncora();
        barco.navegar();
        barco.ancorar();
        barco.desligar();

        System.out.println();

        // Testando Avião
        aviao.ligar();
        aviao.decolar();
        aviao.pousar();
        aviao.desligar();
    }
}

