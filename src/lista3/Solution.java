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
        return (input[0] < (input[1] + input[2]) && input[1] < (input[0] + input[2]) && input[2] < (input[1] + input[0]));
    }

    public static int idadeEmDias(int[] input) {
        int diasDeVida = input[0] * 365 + input[1] * 30 + input[2];
        return diasDeVida;
    }
    //double[] input = {2.0, 5.0, 8.0, 6.0};
    public static String mediaAproveitamento(double[] input) {
        double media_aproveitamento = (input[0] + input[1] + input[2] + input[3]) / 4;
        System.out.println(media_aproveitamento);
        String conceito = "";
        if (media_aproveitamento >= 9.0) {
            conceito = "A";
        } else if (media_aproveitamento >= 7.5 && media_aproveitamento < 9.0) {
            conceito = "B";
        } else if (media_aproveitamento >= 6.0 && media_aproveitamento < 7.5) {
            conceito = "C";
        } else if (media_aproveitamento < 6.0) {
            conceito = "D";
        } else {
            System.out.println("Media invalida");
        }
        return conceito;
    }

    public static int numeroUnico(int[] input) {
        boolean unico;
        int saida = -1;
        for( int i = 0; i < input.length; i++){
            unico = true;
            for ( int j = 0; j < input.length; j++){
                if(i == j){
                    continue;
                }
                if( input[i] == input[j]){
                     unico = false;
                     break;
                }
            }
            if(unico){
                saida = input[i];
                break;
            }

        }
        return saida;
    }
}





