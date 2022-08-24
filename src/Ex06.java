package lista1;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o Raio do circulo: ");
        float raio = in.nextFloat();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println(area);
        in.close();
    }

}
