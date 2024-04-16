public class Main {
    public static void main(String[] args) {
        peliculas miPelicula = new peliculas();
        miPelicula.nombre="matrix";
        miPelicula.duracion=180;
        miPelicula.fechaLanzamiento=1988;
        System.out.println("*******************************");
        System.out.println("Mi pelicula es: "+ miPelicula.nombre);
        System.out.println("Duracion en min es: "+ miPelicula.duracion);
        System.out.println("Fecha de lanzamiento es: "+ miPelicula.fechaLanzamiento);
        System.out.println("*******************************");

        System.out.println("************* Impresion del objeto miPelicula ******************");
        System.out.println(miPelicula);

    }
}