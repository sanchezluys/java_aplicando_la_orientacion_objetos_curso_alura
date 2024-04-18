package com.aluracursos.modelos;

public class peliculas {
    private String nombre;
    private int fechaLanzamiento;
    private int duracion;
    //**


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void muestraFicha() {
        System.out.println("*******************************");
        System.out.println("Mi pelicula es: "+ nombre);
        System.out.println("Duracion en min es: "+ duracion);
        System.out.println("Fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("*******************************");
    }
}
