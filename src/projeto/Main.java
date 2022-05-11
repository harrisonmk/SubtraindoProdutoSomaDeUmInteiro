package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String n;
        int totalMultiplicacao = 1;
        int totalSoma = 0;
        int resultadoFinal;
        String[] valores;
        int[] calculo1;

        n = scan.next();
        valores = n.split("");
        calculo1 = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {

            calculo1[i] = Integer.parseInt(valores[i]);

            totalMultiplicacao = totalMultiplicacao * calculo1[i];
            totalSoma = totalSoma + calculo1[i];

        }

        resultadoFinal = totalMultiplicacao - totalSoma;
        System.out.println(resultadoFinal);

    }

}
