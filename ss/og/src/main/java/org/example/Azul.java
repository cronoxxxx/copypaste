package org.example;

public class Azul extends Carta {
    public Azul(String tipo) {
        super(tipo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+getTipo();
    }

    @Override
    public int valoracion() {
        int valoracion = 0;
        if (tipo.equals("Piedra")){
            valoracion = 3;
        } else if (tipo.equals("Papel")) {
            valoracion = 2;
        } else if (tipo.equals("Tijera")) {
            valoracion = 1;
        }
        return valoracion;
    }
}
