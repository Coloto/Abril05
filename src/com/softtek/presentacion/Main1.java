package com.softtek.presentacion;


import com.softtek.modelo.empleado.Empleado;
import com.softtek.modelo.empleado.Gerente;
import com.softtek.modelo.empleado.Operador;
import com.softtek.modelo.empleado.Vendedor;
import com.softtek.modelo.figuras.Cuadrado;
import com.softtek.modelo.figuras.Triangulo;
import com.softtek.modelo.producto.Producto;
import com.softtek.modelo.producto.ProductoPerecedero;

import java.time.LocalDate;

public class Main1 {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
    }

    public static void ejercicio1() {
        Producto producto1 = new Producto("Mesa", 30, 79.99);
        Producto producto2 = new Producto("Silla", 87, 29.95);
        ProductoPerecedero productoPerecedero1 = new ProductoPerecedero("Zumo de uva", 150, 2.95, LocalDate.of(2024, 1, 1), LocalDate.of(2025, 3,3));
        ProductoPerecedero productoPerecedero2 = new ProductoPerecedero("Yogurt griego", 230, 4.00, LocalDate.of(2023, 6, 5), LocalDate.of(2024, 8,18));

        System.out.println("La mesa cuesta " + producto1.cantidadAPagar() + "€");
        System.out.println("La silla cuesta " + producto2.cantidadAPagar() + "€");

        System.out.println("El zumo de uva cuesta " + productoPerecedero1.cantidadAPagar() + "€");
        System.out.println("El zumo de uva caduca a los " + productoPerecedero1.tiempoConsumicion() + " días.");

        System.out.println("El yogurt griegode uva cuesta " + productoPerecedero2.cantidadAPagar() + "€");
        System.out.println("El Yogurt caduca a los " + productoPerecedero2.tiempoConsumicion() + " días.");
    }

    public static void ejercicio2() {
        Empleado empleado1 = new Empleado("Juan", 1500);
        Gerente gerente1 = new Gerente("Paco", 1700, 230.80);
        Vendedor vendedor1 = new Vendedor("Maria", 1560, 300, 0.1);
        Operador operador1 = new Operador("Mario", 1300, 30, 5);

        System.out.println(empleado1.calcularNomina());
        System.out.println(gerente1.calcularNomina());
        System.out.println(vendedor1.calcularNomina());
        System.out.println(operador1.calcularNomina());
    }

    public static void ejercicio3() {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(4);
        Cuadrado cMediano = new Cuadrado(6);

        Triangulo tPeque = new Triangulo();
        tPeque.setAltura(7);
        tPeque.setBase(5);
        Triangulo tMediano = new Triangulo(8,4);



    }
}
