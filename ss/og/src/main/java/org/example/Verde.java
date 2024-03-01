package org.example;

public class Verde extends Carta {
    public Verde(String tipo) {
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
            valoracion = 2;
        } else if (tipo.equals("Papel")) {
            valoracion = 1;
        } else if (tipo.equals("Tijera")) {
            valoracion = 3;
        }
        return valoracion;
    }
}
