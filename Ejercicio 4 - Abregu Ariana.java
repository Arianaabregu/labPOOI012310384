//4. Escriba una sentencia de Java que imprima true (verdadero), si numA y numB tienen el mismo signo (+/-)
//***************

public class Main {
    public static void main(String[] args) {
        double numA = 10.5; // Cambia el valor de numA según tus necesidades
        double numB = +7.0;// Cambia el valor de numB según tus necesidades

        boolean tienenMismoSigno = (numA >= 0 && numB >= 0) || (numA < 0 && numB < 0) || (numA == 0 && numB == 0);

        System.out.println(tienenMismoSigno);
    }
}
