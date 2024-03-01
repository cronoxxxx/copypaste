package org.example;

public abstract class Carta {
    protected String tipo;

    public Carta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public abstract String toString();
    public abstract int valoracion();
    public abstract int valoracionMas();
}
