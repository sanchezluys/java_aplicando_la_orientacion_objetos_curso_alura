import com.aluracursos.modelos.peliculas;

public class Main {
    public static void main(String[] args) {
        peliculas miPelicula = new peliculas();
        miPelicula.setNombre("matrix");
        miPelicula.setDuracion(180);
        miPelicula.setFechaLanzamiento(1988);
        //**
        peliculas otraPelicula = new peliculas();
        otraPelicula.setNombre("incepcion");
        otraPelicula.setFechaLanzamiento(1998);
        //**
        System.out.println("*******************************");
        System.out.println("Mi pelicula es: "+ miPelicula.getNombre());
        System.out.println("Duracion en min es: "+ miPelicula.getDuracion());
        System.out.println("Fecha de lanzamiento es: "+ miPelicula.getFechaLanzamiento());
        System.out.println("*******************************");

        System.out.println("************* Impresion del objeto miPelicula ******************");
        System.out.println(miPelicula);
        //**
        System.out.println("*******************************");
        System.out.println("Mi otra pelicula es: "+ otraPelicula.getNombre());
        System.out.println("Duracion en min es: "+ otraPelicula.getDuracion());
        System.out.println("Fecha de lanzamiento es: "+ otraPelicula.getFechaLanzamiento());
        System.out.println("*******************************");
        //**
        System.out.println("************* Impresion del objeto otraPelicula ******************");
        System.out.println(otraPelicula);
        //**
        System.out.println("****** Ahora usando la propiedad del objeto  ******************");
        miPelicula.muestraFicha();

    }
}