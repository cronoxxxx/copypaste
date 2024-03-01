package org.example;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca nombre jugador 1");
        Jugador jug1 = new Jugador(teclado.next());
        System.out.println("Introduzca nombre jugador 2");
        Jugador jug2 = new Jugador(teclado.next());
        boolean valido = false;
        Juego juego = new Juego(jug1, jug2, 1);
        Baraja baraja = new Baraja();
        do {
            System.out.println("Introduzca 1 si desea jugar a PPT con dos colores, 2 para jugar a PPT con tres colores o 3 para PPTLS con 5 colores.");
            switch (teclado.nextInt()) {
                case 1:
                    juego = new Juego(jug1, jug2, 1);
                    baraja = new Baraja();
                    valido = true;
                    break;
                case 2:
                    juego = new Juego(jug1, jug2, 1);
                    baraja = new Baraja(1);
                    valido = true;
                    break;
                case 3:
                    juego = new Juego(jug1, jug2, 2);
                    baraja = new Baraja(2);
                    valido = true;
                    break;
                default:
                    System.out.println("Introduzca una opción válida.");
            }
        } while (!valido);
        System.out.println(baraja.toString());
        baraja.barajar();
        System.out.println("Tras barajar\n" + baraja.toString());
        baraja.repartir(jug1, jug2);
        System.out.println(jug1 + "\n" + jug2);
        do {
            System.out.println("Ronda " + (juego.getTurno() + 1) + " " + juego.jugada());
        } while (juego.getTurno() < 12);
        System.out.println(juego.ganador());
    }
}