package com.softtek.modelo.empleado;

public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    public double calcularNomina(){
        return sueldo+bono*porcentaje;
    }
}
