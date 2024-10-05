public class Main {
            public static void main(String[] arg)
            {
                System.out.println("Bienvenido(a) a Screen Match ");
                System.out.println("Pelicula: Matrix ");

                String Pelicula = "Matrix";
                int FechaDeLanzamiento = 1999;
                double Calificacion = 8.2;
                boolean Disponible = true;

                double Media = (9.0 + 8.2 +6.0) /3;

                //Conversion de tipo de datos o Casteo
                int clasificacion = (int) (Media /2);

                String Sinopsis = """
                        Matrix es la mejor pelicula del fin del milenio
                        Fue Lanzada en: """ + FechaDeLanzamiento + " y Tiene una Puntuacion de: " + clasificacion + " estrellas. ";
                System.out.println(Sinopsis);




            }
        }