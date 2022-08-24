package lista1;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fº: ");
        int f = in.nextInt();
        int c = 5 * (f-32) /9;
        System.out.println("Temperatura em Cº: "+c);
        in.close();
    }

}
