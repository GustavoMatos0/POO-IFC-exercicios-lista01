package lista1;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a medida em métros: ");
        float m = in.nextFloat();
        float c = m*100;
        System.out.println("A medida "+m+"M é igual a "+c+"Cm");
        in.close();
    }

}
