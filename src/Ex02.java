package lista1;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número (int): ");
        int n1 = in.nextInt();
        System.out.println("O número informado foi: "+n1);
        in.close();
    }

}
