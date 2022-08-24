package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Informe a area em metros quadrados: ");
        float area = in.nextFloat();
        float litros = area/3;
        float quant = litros / 18;
        float preco = quant*80;
        System.out.println("Serão usados: " +litros+" litros");
        System.out.println("Quantidade de latas necessarias: "+quant);
        System.out.println("Valor: " + df.format(preco) + "R$");
        in.close();
    }

}
