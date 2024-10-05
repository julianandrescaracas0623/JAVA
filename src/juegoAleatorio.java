import java.util.Random;
import java.util.Scanner;

public class juegoAleatorio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        int NumeroSecreto =  rand.nextInt(20)+1; //Genera numeros Aletorios entre 1 y 20
        int Intentos = 5;
        int IntentosRestantes = Intentos;
        int numero;

        System.out.println("Bienvenido al Juego del Número Secreto");
        System.out.println("Tienes " + Intentos + " para descubrir el valor del número Secreto ");

        while (IntentosRestantes > 0)
        {
            System.out.println("Ingresa un Número: ");
            numero = teclado.nextInt();
            
            if( numero == NumeroSecreto)
            {
                System.out.println("Felicidades has dado con el Número Secreto Crack. ");
                break;
            } else if (numero > NumeroSecreto) {
                System.out.println("El Número Secreto es Menor. Intente de Nuevo. ");
            }else{
                System.out.println("El Número Secreto es Mayor. Intente de Nuevo. ");
            }

            IntentosRestantes--;
            System.out.println("Te quedan " + IntentosRestantes + " Intentos Restantes. ");
        }
        if(IntentosRestantes == 0)
        {
            System.out.println("Lo siento, Se acabaron los intentos Vuelve a Empezar.");
        }

        System.out.println(" El número aleatorio era el: " + NumeroSecreto);
    }
}
