package Entities;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimento {
    private String tipo;
    private double valor;
    private LocalDateTime data;

    public Movimento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }
    public LocalDateTime getData() {
        return data;
    }


    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return tipo + " de R$ " + valor + " em " + data.format(fmt);
    }
}
