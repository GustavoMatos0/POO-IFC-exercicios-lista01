package lista1;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe dois números inteiros: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println("Informe um número real: ");
        float n3 = in.nextFloat();
        int a = n1 * 2 * n2 / 2;
        float b = (n1 * 3) + n3;
        double c = Math.pow(n3, 3);
        System.out.println("Resposta letra a: " + a);
        System.out.println("Resposta letra b: " + b);
        System.out.println("Resposta letra c: " + c);
        in.close();
    }

}
