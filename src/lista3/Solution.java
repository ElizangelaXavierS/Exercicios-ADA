package lista3;

import java.util.Arrays;

public class Solution {
    public static String geraRecibo(double[] input) {
        double totalSemDesconto = 0;
        double valorDoDesconto = 0;

        Arrays.sort(input);

        for (int i = 0; i < input.length; i++) {
            totalSemDesconto += input[i];
        }

        for (int i = 0; i < input.length / 2; i++) {
            valorDoDesconto += input[i] / 2;
        }

        double totalAPagar = totalSemDesconto - valorDoDesconto;

        return "Valor total:" + totalSemDesconto + " | Valor de descontos: " + valorDoDesconto + " | Valor a pagar: " + totalAPagar;
    }

    public static boolean eUmTriangulo(int[] input) {

        if (input[0] < (input[1] + input[2]) && input[1] < (input[0] + input[2]) && input[2] < (input[1] + input[0])) {
            return true;
        } else {
            return false;
        }
    }

}

