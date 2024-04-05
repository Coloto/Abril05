package com.softtek.modelo.producto;

public class Producto {
    protected String nombre;
    protected int cantidad;
    protected double pvp;

    public Producto(String nombre, int cantidad, double pvp) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pvp = pvp;
    }

    public double cantidadAPagar() {
        return pvp;
    }
}
