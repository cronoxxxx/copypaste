package eco;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Jugador1:");
        String nombreJugador1 = scanner.nextLine();
        System.out.println("Ingrese el nombre del Jugador2:");
        String nombreJugador2 = scanner.nextLine();

        Juego juego = new Juego(nombreJugador1, nombreJugador2);

        while (juego.hayGanador() == null) {
            juego.siguienteTurno();
            juego.mostrarTablero();
            juego.mostrarTableroGrafico();
            System.out.println("¿Desea continuar? (s/n)");
            String respuesta = scanner.nextLine().toLowerCase();

            if (!respuesta.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}

