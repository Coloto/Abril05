package com.softtek.modelo.empleado;

public class Vendedor extends Empleado{
    private double ventas;
    private double comision;

    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }

    public double calcularNomina(){
        return sueldo+(ventas*comision)*porcentaje;
    }
}
