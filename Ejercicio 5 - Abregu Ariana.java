
// 5. liza la sentencia switch para escribir una sentencia de Java que imprima los siete días de la emana de acuerdo al número ingresado. Asegúrate de usar la clase Scanner para capturar losdatos que ingresa el usuario a través de un dispositivo de entrada (Por ejemplo, el teclado).
//****************


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7 para conocer el día de la semana: ");
        int numero = scanner.nextInt();

        String diaSemana;

        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número fuera de rango";
                break;
        }

        System.out.println("El día de la semana correspondiente al número ingresado es: " + diaSemana);

        scanner.close(); 
    }
}
