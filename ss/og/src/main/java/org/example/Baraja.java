package org.example;

import java.util.Arrays;

public class Baraja {
    private Carta[] cartas;

    public Baraja() {
        cartas = new Carta[24];
        for (int i = 0; i < 4; i++) {
            cartas[i] = new Azul("Piedra");
        }
        for (int i = 4; i < 8; i++) {
            cartas[i] = new Azul("Papel");
        }
        for (int i = 8; i < 12; i++) {
            cartas[i] = new Azul("Tijera");
        }
        for (int i = 12; i < 16; i++) {
            cartas[i] = new Verde("Piedra");
        }
        for (int i = 16; i < 20; i++) {
            cartas[i] = new Verde("Papel");
        }
        for (int i = 20; i < 24; i++) {
            cartas[i] = new Verde("Tijera");
        }
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public void barajar() {
        Carta[] barajadas = new Carta[cartas.length];
        for (int i = 0; i < cartas.length; i++) {
            boolean done = false;
            do {
                int pos = (int) (Math.random() * 24);
                if (barajadas[pos] == null) {
                    barajadas[pos] = cartas[i];
                    done = true;
                }
            } while (!done);
        }
        cartas = barajadas;
    }

    public void repartir(Jugador jug1, Jugador jug2) {
        Carta[] mano1 = new Carta[cartas.length / 2];
        Carta[] mano2 = new Carta[cartas.length / 2];
        for (int i = 0; i < cartas.length; i++) {
            if (i < 12) {
                mano1[i] = cartas[i];
            } else {
                mano2[i - 12] = cartas[i];
            }
        }
        jug1.setMano(mano1);
        jug2.setMano(mano2);
    }

    @Override
    public String toString() {
        return Arrays.toString(cartas);
    }
}
