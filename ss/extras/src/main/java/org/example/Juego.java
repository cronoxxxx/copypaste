package org.example;

public class Juego {
    private int turno;
    private Jugador jug1;
    private Jugador jug2;
    private boolean modo;
    //si es true es un PPT si no PPTLS

    public Juego(Jugador jug1, Jugador jug2, int nivel) {
        if (nivel == 1) {
            modo = true;
        } else {
            modo = false;
        }
        this.turno = 0;
        this.jug1 = jug1;
        this.jug2 = jug2;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno() {
        this.turno = turno + 1;
    }

    public Jugador getJug1() {
        return jug1;
    }

    public void setJug1(Jugador jug1) {
        this.jug1 = jug1;
    }

    public Jugador getJug2() {
        return jug2;
    }

    public void setJug2(Jugador jug2) {
        this.jug2 = jug2;
    }

    public String jugada() {
        String ganador = null;
        if (modo) {
            if (jug1.devuelveCarta(turno).getTipo().equals("Piedra") && jug2.devuelveCarta(turno).getTipo().equals("Tijera")
                    || jug1.devuelveCarta(turno).getTipo().equals("Tijera") && jug2.devuelveCarta(turno).getTipo().equals("Papel")
                    || jug1.devuelveCarta(turno).getTipo().equals("Papel") && jug2.devuelveCarta(turno).getTipo().equals("Piedra")) {
                ganador = jug1.getNombre();
                jug1.setVictorias();
            } else if (jug2.devuelveCarta(turno).getTipo().equals("Piedra") && jug1.devuelveCarta(turno).getTipo().equals("Tijera")
                    || jug2.devuelveCarta(turno).getTipo().equals("Tijera") && jug1.devuelveCarta(turno).getTipo().equals("Papel")
                    || jug2.devuelveCarta(turno).getTipo().equals("Papel") && jug1.devuelveCarta(turno).getTipo().equals("Piedra")) {
                ganador = jug2.getNombre();
                jug2.setVictorias();
            } else if (jug1.devuelveCarta(turno).getTipo().equals("Piedra") && jug2.devuelveCarta(turno).getTipo().equals("Piedra")
                    || jug1.devuelveCarta(turno).getTipo().equals("Tijera") && jug2.devuelveCarta(turno).getTipo().equals("Tijera")
                    || jug1.devuelveCarta(turno).getTipo().equals("Papel") && jug2.devuelveCarta(turno).getTipo().equals("Papel")) {
                if (jug1.devuelveCarta(turno).valoracion() > jug2.devuelveCarta(turno).valoracion()) {
                    ganador = jug1.getNombre();
                    jug1.setVictorias();
                } else if (jug1.devuelveCarta(turno).valoracion() < jug2.devuelveCarta(turno).valoracion()) {
                    ganador = jug2.getNombre();
                    jug2.setVictorias();
                } else if (jug1.devuelveCarta(turno).valoracion() == jug2.devuelveCarta(turno).valoracion()) {
                    ganador = "Empate";
                }
            }
        } else {
            if (jug1.devuelveCarta(turno).getTipo().equals("Piedra") && jug2.devuelveCarta(turno).getTipo().equals("Tijera")
                    || jug1.devuelveCarta(turno).getTipo().equals("Tijera") && jug2.devuelveCarta(turno).getTipo().equals("Papel")
                    || jug1.devuelveCarta(turno).getTipo().equals("Papel") && jug2.devuelveCarta(turno).getTipo().equals("Piedra")
                    || jug1.devuelveCarta(turno).getTipo().equals("Lagarto") && jug2.devuelveCarta(turno).getTipo().equals("Spock")
                    || jug1.devuelveCarta(turno).getTipo().equals("Spock") && jug2.devuelveCarta(turno).getTipo().equals("Tijera")
                    || jug1.devuelveCarta(turno).getTipo().equals("Tijera") && jug2.devuelveCarta(turno).getTipo().equals("Lagarto")
                    || jug1.devuelveCarta(turno).getTipo().equals("Lagarto") && jug2.devuelveCarta(turno).getTipo().equals("Papel")
                    || jug1.devuelveCarta(turno).getTipo().equals("Papel") && jug2.devuelveCarta(turno).getTipo().equals("Spock")
                    || jug1.devuelveCarta(turno).getTipo().equals("Spock") && jug2.devuelveCarta(turno).getTipo().equals("Piedra")
                    || jug1.devuelveCarta(turno).getTipo().equals("Piedra") && jug2.devuelveCarta(turno).getTipo().equals("Lagarto")) {
                ganador = jug1.getNombre();
                jug1.setVictorias();
            } else if (jug2.devuelveCarta(turno).getTipo().equals("Piedra") && jug1.devuelveCarta(turno).getTipo().equals("Tijera")
                    || jug2.devuelveCarta(turno).getTipo().equals("Tijera") && jug1.devuelveCarta(turno).getTipo().equals("Papel")
                    || jug2.devuelveCarta(turno).getTipo().equals("Papel") && jug1.devuelveCarta(turno).getTipo().equals("Piedra")
                    || jug2.devuelveCarta(turno).getTipo().equals("Lagarto") && jug1.devuelveCarta(turno).getTipo().equals("Spock")
                    || jug2.devuelveCarta(turno).getTipo().equals("Spock") && jug1.devuelveCarta(turno).getTipo().equals("Tijera")
                    || jug2.devuelveCarta(turno).getTipo().equals("Tijera") && jug1.devuelveCarta(turno).getTipo().equals("Lagarto")
                    || jug2.devuelveCarta(turno).getTipo().equals("Lagarto") && jug1.devuelveCarta(turno).getTipo().equals("Papel")
                    || jug2.devuelveCarta(turno).getTipo().equals("Papel") && jug1.devuelveCarta(turno).getTipo().equals("Spock")
                    || jug2.devuelveCarta(turno).getTipo().equals("Spock") && jug1.devuelveCarta(turno).getTipo().equals("Piedra")
                    || jug2.devuelveCarta(turno).getTipo().equals("Piedra") && jug1.devuelveCarta(turno).getTipo().equals("Lagarto")) {
                ganador = jug2.getNombre();
                jug2.setVictorias();
            } else if (jug1.devuelveCarta(turno).getTipo().equals(jug2.devuelveCarta(turno).getTipo())) {
                if (jug1.devuelveCarta(turno).valoracionMas() > jug2.devuelveCarta(turno).valoracionMas()) {
                    ganador = jug1.getNombre();
                    jug1.setVictorias();
                } else if (jug1.devuelveCarta(turno).valoracionMas() < jug2.devuelveCarta(turno).valoracionMas()) {
                    ganador = jug2.getNombre();
                    jug1.setVictorias();
                } else if (jug1.devuelveCarta(turno).valoracionMas() < jug2.devuelveCarta(turno).valoracionMas()) {
                    ganador = "Empate";
                }
            }
        }

        setTurno();
        return ganador;
    }

    public String ganador() {
        String fin = null;
        if (jug1.getVictorias() > jug2.getVictorias()) {
            fin = "Felicidades " + jug1.getNombre();
        } else if (jug1.getVictorias() < jug2.getVictorias()) {
            fin = "Felicidades " + jug2.getNombre();
        } else {
            int cartasverjug1 = 0;
            for (int i = 0; i < jug1.getMano().length; i++) {
                if (jug1.devuelveCarta(i).getClass().getSimpleName().equals("Verde")) {
                    cartasverjug1++;
                }
            }
            int cartasverjug2 = 0;
            for (int i = 0; i < jug2.getMano().length; i++) {
                if (jug2.devuelveCarta(i).getClass().getSimpleName().equals("Verde")) {
                    cartasverjug2++;
                }
            }
            if (cartasverjug1 > cartasverjug2) {
                fin = "Felicidades " + jug1.getNombre();
            } else if (cartasverjug1 < cartasverjug2) {
                fin = "Felicidades " + jug2.getNombre();
            } else {
                fin = "Empate";
            }
        }
        return fin;
    }
}
