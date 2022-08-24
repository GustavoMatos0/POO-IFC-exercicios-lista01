package lista1;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado: ");
        float l = in.nextFloat();
        double area = Math.pow(l, 2);
        System.out.println("Area do quadrado: " + area);
        in.close();
    }

}
