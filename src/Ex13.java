package lista1;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float ex = 0;
        float mul = 0;
        System.out.println("Informe o peso dos peixer: ");
        float peso = in.nextFloat();
        if (peso > 50) {
            ex = peso - 50;
            mul = ex * 4;
        }
        System.out.println("Peso total: " + peso + "Kg");
        System.out.println("Excesso: " + ex + "Kg");
        System.out.print("Multa:");
        System.out.printf("%.2f", mul);
        System.out.println("R$");
        in.close();
    }

}
