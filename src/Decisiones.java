public class Decisiones {

    public static void main(String[] args) {
        String Pelicula = "Matrix";
        int FechaDeLanzamiento = 1999;
        double Calificacion = 8.2;
        boolean Disponible = false;
        String Plan = "Plus";

        // codigo que prueba los operadores relacionales
        if (FechaDeLanzamiento >= 2022) {
            System.out.println("pelicula Popuelar");
        } else {
            System.out.println("es una Pelicula Vieja que vale la pena ver");
        }

        // Si la pelicula esta disponible o si plan es igual a Plus se realizara una accion y el .equals se utiliza para comprar Strings
        if (Disponible || Plan.equals("Plus")) {
            System.out.println("Disfruta de tu Pelicula");
        } else
        {
            System.out.println("No cuentas con un Plan Plus, Suscribete y obten un plan.");
        }
    }
}
