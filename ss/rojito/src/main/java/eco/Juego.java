package eco;

import java.util.Scanner;

public class Juego {
    private static final int META = 96;
    private static final int SALIDA = 0;

    private String nombreJugador1;
    private String nombreJugador2;
    private int casillaJugador1;
    private int casillaJugador2;

    public Juego(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
        this.casillaJugador1 = SALIDA;
        this.casillaJugador2 = SALIDA;
    }

    public void mostrarTableroGrafico() {
        System.out.println("Tablero:");
        for (int i = 0; i < META; i++) {
            char casilla = ' ';
            if (i == casillaJugador1) {
                casilla = 'A';
            } else if (i == casillaJugador2) {
                casilla = 'B';
            }

            switch (i) {
                case 6:
                case 23:
                case 42:
                case 64:
                    casilla = 'M';
                    break;
                case 28:
                    casilla = 'P';
                    break;
                case 79:
                    casilla = 'D';
                    break;
            }

            System.out.print(casilla + "  ");
            if ((i + 1) % 16 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("----------------------------");
    }

    public void siguienteTurno() {
        lanzarDado(nombreJugador1, casillaJugador1);
        if (hayGanador() == null) {
            lanzarDado(nombreJugador2, casillaJugador2);
        }
    }

    public void mostrarTablero() {
        System.out.println("Tablero:");
        System.out.println(nombreJugador1 + " está en la casilla " + casillaJugador1);
        System.out.println(nombreJugador2 + " está en la casilla " + casillaJugador2);
        System.out.println("----------------------------");
    }

    public String hayGanador() {
        if (casillaJugador1 >= META - 1) {
            return nombreJugador1;
        } else if (casillaJugador2 >= META - 1) {
            return nombreJugador2;
        } else {
            return null;
        }
    }

    private void lanzarDado(String nombreJugador, int casillaJugador) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Turno de " + nombreJugador);
        int dado = ((int) (Math.random() * 6) + 1) * 6;  // Dados de 6 en 6
        System.out.println("Dado: " + dado);

        if (casillaJugador + dado > META) {
            int movimientoRestante = META - casillaJugador;
            int movimientosFaltantes = (int) Math.ceil((double) movimientoRestante / 6);
            dado = movimientosFaltantes * 6;
            System.out.println("El movimiento te llevará más allá de la meta. Moverás " + dado + " y se cambia el turno.");
        }

        casillaJugador += dado;

        // Ajustar la posición si es negativa
        while (casillaJugador < 0) {
            casillaJugador += META;  // Suma el tamaño del tablero
        }

        // Implementar la lógica para cada tipo de casilla
        if (dado == 6) {
            System.out.println("Corre corre que te pillan. Se cambia el turno.");
        } else if (dado == 120) {
            System.out.println("No hay quien te pare. Se cambia el turno.");
            casillaJugador += dado;  // Se mueve el doble
        } else if (dado <= 60) {
            System.out.println("Un mercadillo improvisado. Retrocede 10 puestos y pierde un turno.");
            casillaJugador -= 10;
        } else if (dado <= 90) {
            System.out.println("De atajo en atajo porque eres el más majo. Vuelve a tirar.");
            casillaJugador += 1;
        } else {
            System.out.println("Drogas no. Vuelve a la casilla de salida. Se cambia el turno.");
            casillaJugador = SALIDA;
        }

        if (casillaJugador >= META) {
            casillaJugador = META - (casillaJugador - META);
            System.out.println("¡Enhorabuena " + nombreJugador + "!!");
        }

        if (nombreJugador.equals(nombreJugador1)) {
            casillaJugador1 = casillaJugador;
        } else {
            casillaJugador2 = casillaJugador;
        }

        System.out.println(nombreJugador + ": " + casillaJugador);
    }
}
