package com.aluracursos.modelos;

public class peliculas {
    String nombre;
    int fechaLanzamiento;
    int duracion;
    //**
    void muestraFicha() {
        System.out.println("*******************************");
        System.out.println("Mi pelicula es: "+ nombre);
        System.out.println("Duracion en min es: "+ duracion);
        System.out.println("Fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("*******************************");
    }
}
