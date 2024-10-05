public class formateo_de_Strings {
    public static void formateoDeStr(String[] arg){

        String nombre = "Julian";
        int edad = 22;
        double estatura = 1.72;

        String informacion = """
                Hola, mi nombre es %s, soy estudiante de ingeniería,
                me gusta lo que hago, tengo %d años y mido %.2f metros de altura.
                """.formatted(nombre, edad, estatura);
        System.out.println(informacion);
    }
}
