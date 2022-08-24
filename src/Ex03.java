package lista1;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe dois números (int): ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int s = n1+n2;
        System.out.println("A soma dos dois números é: " + s);
        in.close();
    }

}
