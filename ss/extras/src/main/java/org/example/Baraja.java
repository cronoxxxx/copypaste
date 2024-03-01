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

    public Baraja(int nivel) {
        if (nivel == 1) {
            //Al 24 no ser múltiplo de 3 meto en la baraja 3 piedra, 3 papeles y 2 tijeras de cada color.
            cartas = new Carta[24];
            for (int i = 0; i < 3; i++) {
                cartas[i] = new Azul("Piedra");
            }
            for (int i = 3; i < 6; i++) {
                cartas[i] = new Azul("Papel");
            }
            for (int i = 6; i < 8; i++) {
                cartas[i] = new Azul("Tijera");
            }
            for (int i = 8; i < 11; i++) {
                cartas[i] = new Verde("Piedra");
            }
            for (int i = 11; i < 14; i++) {
                cartas[i] = new Verde("Papel");
            }
            for (int i = 14; i < 16; i++) {
                cartas[i] = new Verde("Tijera");
            }
            for (int i = 16; i < 19; i++) {
                cartas[i] = new Rojo("Piedra");
            }
            for (int i = 19; i < 22; i++) {
                cartas[i] = new Rojo("Papel");
            }
            for (int i = 22; i < 24; i++) {
                cartas[i] = new Rojo("Tijera");
            }
        }
        if (nivel == 2) {
            //Al 24 no ser múltiplo de 5 meto en la baraja 1 carta de cada carta y color menos el spock naranja.
            cartas = new Carta[24];
            cartas[0] = new Azul("Piedra");
            cartas[1] = new Azul("Papel");
            cartas[2] = new Azul("Tijera");
            cartas[3] = new Azul("Lagarto");
            cartas[4] = new Azul("Spock");
            cartas[5] = new Verde("Piedra");
            cartas[6] = new Verde("Papel");
            cartas[7] = new Verde("Tijera");
            cartas[8] = new Verde("Lagarto");
            cartas[9] = new Verde("Spock");
            cartas[10] = new Rojo("Piedra");
            cartas[11] = new Rojo("Papel");
            cartas[12] = new Rojo("Tijera");
            cartas[13] = new Rojo("Lagarto");
            cartas[14] = new Rojo("Spock");
            cartas[15] = new Amarillo("Piedra");
            cartas[16] = new Amarillo("Papel");
            cartas[17] = new Amarillo("Tijera");
            cartas[18] = new Amarillo("Lagarto");
            cartas[19] = new Amarillo("Spock");
            cartas[20] = new Naranja("Piedra");
            cartas[21] = new Naranja("Papel");
            cartas[22] = new Naranja("Tijera");
            cartas[23] = new Naranja("Lagarto");
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
