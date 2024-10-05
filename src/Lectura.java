import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el Nombre de tu Película Favorita: ");
        String pelicula = teclado.nextLine();

        System.out.println("Ahora escribe la fecha de lanzamiento: ");
        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Qué calificación le das a esta película: ");
        double calificacion = teclado.nextDouble();

        // Consumir la línea sobrante antes de leer la opinión
        teclado.nextLine();

        System.out.println("¿Qué opinas sobre la Película? ");
        String opinion = teclado.nextLine();

        System.out.println("Película: " + pelicula);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Opinión: " + opinion);
    }
}
