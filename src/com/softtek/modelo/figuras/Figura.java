package com.softtek.modelo.figuras;

public abstract class Figura {
    protected int x;
    protected int y;

    public Figura() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public abstract double calcularArea();
    public abstract String mostrarPsoicion();
}
