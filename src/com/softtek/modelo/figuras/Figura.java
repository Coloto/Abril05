package com.softtek.modelo.figuras;

public class Figura {
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

    public double calcularArea(){
        return 0;
    }
    public String mostrarPsoicion(){
        return null;
    }
}
