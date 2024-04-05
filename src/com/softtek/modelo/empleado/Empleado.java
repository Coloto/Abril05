package com.softtek.modelo.empleado;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected double porcentaje;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.porcentaje = 0.75;
    }

    public double calcularNomina(){
        return sueldo*porcentaje;
    }
}
