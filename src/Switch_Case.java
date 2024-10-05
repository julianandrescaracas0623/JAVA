public class Switch_Case {
    public static void main(String[] args) {

        int dias_Semana = 4;

        switch (dias_Semana){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;

            default:
                System.out.println("Dia no Valido");
        }

    }
}
