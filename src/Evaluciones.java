import java.util.Scanner;

public class Evaluciones {
    public static void main(String[] args) {

        Scanner  teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double TotalEvaluaciones = 0;

        while(nota != -1){
            System.out.println("Escribe la nota que le darias a la pelicula de Matrix: ");
            nota = teclado.nextDouble();

            if(nota != -1)
            {
                mediaEvaluaciones += nota;
                TotalEvaluaciones++;
            }
        }
        System.out.println("El promedio de calificación para esta pelicula es de : " + mediaEvaluaciones / TotalEvaluaciones);
    }
}
