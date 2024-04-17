import com.aluracursos.modelos.peliculas;

public class Main {
    public static void main(String[] args) {
        peliculas miPelicula = new peliculas();
        miPelicula.nombre="matrix";
        miPelicula.duracion=180;
        miPelicula.fechaLanzamiento=1988;
        //**
        peliculas otraPelicula = new peliculas();
        otraPelicula.nombre="incepcion";
        otraPelicula.duracion=120;
        otraPelicula.fechaLanzamiento=1998;
        //**
        System.out.println("*******************************");
        System.out.println("Mi pelicula es: "+ miPelicula.nombre);
        System.out.println("Duracion en min es: "+ miPelicula.duracion);
        System.out.println("Fecha de lanzamiento es: "+ miPelicula.fechaLanzamiento);
        System.out.println("*******************************");

        System.out.println("************* Impresion del objeto miPelicula ******************");
        System.out.println(miPelicula);
        //**
        System.out.println("*******************************");
        System.out.println("Mi otra pelicula es: "+ otraPelicula.nombre);
        System.out.println("Duracion en min es: "+ otraPelicula.duracion);
        System.out.println("Fecha de lanzamiento es: "+ otraPelicula.fechaLanzamiento);
        System.out.println("*******************************");
        //**
        System.out.println("************* Impresion del objeto otraPelicula ******************");
        System.out.println(otraPelicula);
        //**
        System.out.println("****** Ahora usando la propiedad del objeto  ******************");
        miPelicula.muestraFicha();

    }
}