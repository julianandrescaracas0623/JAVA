public class temperatura {
    public static void main(String[] arg){

        /* Escribe un programa que convierta una temperatura en grados celcius
        Utiliza  variables para representar los valores de las temperaturas e imprime e imprime en consola el
        valor convertido de celsius a grados.*/


        double gradosCelcius = 30.4;
        double gradosFahrenheit =  (gradosCelcius*1.8)+32;
        String mensaje = String.format("La temperatura de %f Celcius es equivalente a %f", gradosCelcius,gradosFahrenheit);
        System.out.println(mensaje);

        int temperatura = (int) (gradosFahrenheit);
        System.out.println("la temperatura es " + gradosFahrenheit);
    }
}
