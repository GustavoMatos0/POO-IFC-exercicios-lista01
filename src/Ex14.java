package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Quanto você ganha por hora R$: ");
        float vh = in.nextFloat();
        System.out.println("Informe o número de horas trabalhadas no mês: ");
        float nh = in.nextFloat();
        double sal = vh * nh;
        double inss = sal * 0.08;
        double sind = sal * 0.05;
        double novosal = sal - (sal * 0.11) - inss - sind;
        System.out.println("Salário Bruto: " + df.format(sal) + "R$");
        System.out.println("INSS " + df.format(inss) + "R$");
        System.out.println("Sindicato: " + df.format(sind) + "R$");
        System.out.println("Salário Líquido " + df.format(novosal) + "R$");
        in.close();
    }

}
