package org.example;

public class Naranja extends Carta {
    public Naranja(String tipo) {
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
            valoracion = 1;
        } else if (tipo.equals("Papel")) {
            valoracion = 3;
        } else if (tipo.equals("Tijera")) {
            valoracion = 2;
        }
        return valoracion;
    }

    @Override
    public int valoracionMas() {
        int valoracion = 0;
        if (tipo.equals("Piedra")){
            valoracion = 5;
        } else if (tipo.equals("Papel")) {
            valoracion = 1;
        } else if (tipo.equals("Tijera")) {
            valoracion = 2;
        } else if (tipo.equals("Lagarto")) {
            valoracion = 3;
        } else if (tipo.equals("Spock")) {
            valoracion = 4;
        }
        return valoracion;
    }
}
