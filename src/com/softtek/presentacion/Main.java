package com.softtek.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {

        //System.out.println(inicioCurso(10));

        //System.out.println("Hoy es " + fechaHoy());

        //System.out.println("La fecha de Australia es: " + fechaZonaAustralia());

        //System.out.println(diaCien());

        //System.out.println(a());

        //System.out.println("Si al 15 de marzo le sumamos 35 semanas nos da: " + b());

        //System.out.println("El empleado lleva " + empleado().getYears() + " años en la empresa.");

        //System.out.println(persona().getYears() + " años, " + persona().getMonths() + " meses y " + persona().getDays() + " dias.");

        //System.out.println("El proyecto deberia empezar el " + empezarProyecto());

        //System.out.println("El periodo del proyecto es de " + periodoProyecto().getMonths() + " meses y " + periodoProyecto().getDays() + " días.");
    }

    public static LocalDate inicioCurso(int dias) {
        LocalDate inicioCurso = LocalDate.of(2024, 04, 02);
        return inicioCurso.plusDays(dias);
    }

    public static LocalDate fechaHoy() {
        return LocalDate.now();
    }

    public static LocalDate fechaZonaAustralia() {
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        return LocalDate.now(sydneyZone);
    }

    public static LocalDate diaCien() {
        LocalDate diaUno = LocalDate.of(2024,1,1);
        return diaUno.plusDays(99);
    }

    public static String a() {
        LocalDate navidad = LocalDate.of(2024,12,25);
        LocalDate nocheVieja = LocalDate.of(2024, 12,31);
        return "Navidad es antes de nochevieja: " + navidad.isBefore(nocheVieja) + "\nNochevieja es antes de navidad: " + navidad.isAfter(nocheVieja);
    }

    public static LocalDate b() {
        LocalDate quinceMarzo = LocalDate.of(2024, 3, 15);
        return quinceMarzo.plusWeeks(35);
    }

    public static Period empleado() {
        LocalDate empleado = LocalDate.of(2012, 7, 6);
        return Period.between(empleado,LocalDate.now());
    }

    public static Period persona() {
        LocalDate persona = LocalDate.of(2007,8,7);
        return Period.between(persona,LocalDate.now());
    }

    public static LocalDate empezarProyecto() {
        LocalDate entrega = LocalDate.of(2024, 10,2);
        return entrega.minusDays(200);
    }

    public static Period periodoProyecto() {
        LocalDate inicio = LocalDate.of(2024,3,15);
        LocalDate fin = LocalDate.of(2024, 10, 20);

        return Period.between(inicio, fin);
    }
}
