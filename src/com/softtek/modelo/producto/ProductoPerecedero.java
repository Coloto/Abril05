package com.softtek.modelo.producto;

import java.time.LocalDate;
import java.time.Period;

public class ProductoPerecedero extends Producto {
    private LocalDate fFabricacion;
    private LocalDate fCaducidad;


    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricacion) {
        super(nombre, cantidad, pvp);
        this.fFabricacion = fFabricacion;
        this.fCaducidad = fCaducidad;
    }

    public int tiempoConsumicion() {
        Period consumicion = Period.between(fCaducidad, fFabricacion);
        return consumicion.getDays();
    }
}
