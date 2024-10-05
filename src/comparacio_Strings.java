import java.sql.SQLOutput;
public class comparacio_Strings {
        public  static void main(String[] arg){

            String Contraseña = "123456";

            // Se utiliza el Metodo equals se usa para comparar el contenido de dos Strings
            if (Contraseña.equals("123456")) {
                System.out.println("Accesos Autorizado! ");
            }else
            {
                System.out.println("Acceso Denegado. ");
            }

        }
}
