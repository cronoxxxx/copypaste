package org.example;

import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Carta[] mano;
    private int victorias;

    public Jugador(String nombre) {
        this.nombre = nombre;
        victorias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta[] getMano() {
        return mano;
    }

    public void setMano(Carta[] mano) {
        this.mano = mano;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias() {
        this.victorias = victorias + 1;
    }

    public Carta devuelveCarta(int pos) {
        return mano[pos];
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + "} \n" + Arrays.toString(mano);
    }
}
