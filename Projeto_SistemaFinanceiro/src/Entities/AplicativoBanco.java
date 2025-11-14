package Entities;



public class AplicativoBanco {
    public static void main(String[] args) {

        Banco banco = new Banco();
        InterfaceMain ui = new InterfaceMain(banco);

        ui.iniciar(); // INICIAR SISTEMA
    }
}
