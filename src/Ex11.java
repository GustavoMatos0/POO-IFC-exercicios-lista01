package lista1;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        float al = in.nextFloat();
        double peso = (72.7 * al) - 58;
        System.out.print("Peso ideal: ");
        System.out.printf("%.2f", peso);
        System.out.println("Kgs");
        in.close();
    }

}
