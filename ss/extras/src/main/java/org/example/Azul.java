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

    @Override
    public int valoracionMas() {
        int valoracion = 0;
        if (tipo.equals("Piedra")){
            valoracion = 1;
        } else if (tipo.equals("Papel")) {
            valoracion = 2;
        } else if (tipo.equals("Tijera")) {
            valoracion = 3;
        } else if (tipo.equals("Lagarto")) {
            valoracion = 4;
        } else if (tipo.equals("Spock")) {
            valoracion = 5;
        }
        return valoracion;
    }
}
