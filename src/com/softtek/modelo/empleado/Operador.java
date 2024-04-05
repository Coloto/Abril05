package com.softtek.modelo.empleado;

public class Operador extends Empleado{
    private int piezas;
    private double incentivo;

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    public double calcularNomina(){
        return sueldo+(piezas*incentivo)*porcentaje;
    }
}
