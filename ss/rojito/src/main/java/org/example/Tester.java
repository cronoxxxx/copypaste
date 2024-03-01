package org.example;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca nombre jugador 1");
        Jugador jug1 = new Jugador(teclado.next());
        System.out.println("Introduzca nombre jugador 2");
        Jugador jug2 = new Jugador(teclado.next());
        Baraja baraja = new Baraja();
        System.out.println(baraja.toString());
        baraja.barajar();
        System.out.println("Tras barajar\n" + baraja.toString());
        baraja.repartir(jug1, jug2);
        System.out.println(jug1 + "\n" + jug2);
        Juego juego = new Juego(jug1,jug2);
        do {
            System.out.println("Ronda "+(juego.getTurno()+1)+" "+juego.jugada());
        }while (juego.getTurno()<12);
        System.out.println(juego.ganador());
    }
}