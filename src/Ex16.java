package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Informe a area em metros quadrados: ");
        float area = in.nextFloat();
        float litros = area / 6;
        float quantlt = litros / 18;
        double quantgl = litros / 3.6;
        float precolt = quantlt * 80;
        double precogl = quantgl * 25;
        System.out.println("Caso escolha latas;");
        System.out.println("Serão usados: " + litros + " litros");
        System.out.println("Quantidade de latas necessarias: " + quantlt);
        System.out.println("Valor: " + df.format(precolt) + "R$");
        System.out.println("");
        System.out.println("Caso escolha galões;");
        System.out.println("Serão usados: " +litros+" litros");
        System.out.println("Quantidade de galões necessarias: "+quantgl);
        System.out.println("Valor: " + df.format(precogl) + "R$");
        in.close();
    }

}
