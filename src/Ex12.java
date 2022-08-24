package lista1;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu sexo (M) (F): ");
        String sex = in.nextLine();
        System.out.println("Informe sua altura: ");
        float al = in.nextFloat();
        double peso;
        if (sex.equals("M")) {
            peso = (72.7 * al) - 58;
            System.out.print("Peso ideal: ");
            System.out.printf("%.2f", peso);
            System.out.println("Kgs");
        } else{
            peso = (62.1 * al) - 44.7;
            System.out.print("Peso ideal: ");
            System.out.printf("%.2f", peso);
            System.out.println("Kgs");
        }
        in.close();
    }

}
