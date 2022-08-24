package lista1;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Indorme a primeira nota: ");
        float n1 = in.nextFloat();
        System.out.print("Indorme a segunda nota: ");
        float n2 = in.nextFloat();
        System.out.print("Indorme a terceira nota: ");
        float n3 = in.nextFloat();
        System.out.print("Indorme a quarta nota: ");
        float n4 = in.nextFloat();
        double m = (n1+n2+n3+n4) / 4;
        System.out.println("A média é: "+m);
        in.close();
    }

}
