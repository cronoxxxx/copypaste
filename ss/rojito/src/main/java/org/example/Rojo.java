package org.example;

public class Rojo extends Carta {
    public Rojo(String tipo) {
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
}
