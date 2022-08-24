package lista1;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora R$: ");
        float vh = in.nextFloat();
        System.out.println("Informe o número de horas trabalhadas no mês: ");
        float nh = in.nextFloat();
        double sal = vh * nh;
        System.out.print("Seu salario neste mês é de: ");
        System.out.printf("%.2f",sal);
        System.out.println(" R$");
        in.close();
    }

}
