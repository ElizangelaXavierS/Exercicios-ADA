package lista6;

import java.text.DecimalFormat;

public class Solution {
    public static double calculoSalario( double[] input) {
        double tempo_servico = input[0];
        double inflacao = input[1] / 100;
        double salario = input[2];

        double percentual_reajuste = inflacao;

        if (tempo_servico >= 1 && tempo_servico <= 5) {
            percentual_reajuste += 0.01;

        }else if ( tempo_servico > 5 && tempo_servico <= 10) {
            percentual_reajuste += 0.015;

        }else if (tempo_servico > 10) {
            percentual_reajuste += 0.02;
        }
        double salarioComReajuste = salario * (1 + percentual_reajuste);
        DecimalFormat df = new DecimalFormat("#.00");
        String salarioFormatado = df.format(salarioComReajuste);

        return Double.parseDouble(salarioFormatado);

    }

    public static int primeiroCaractereUnico(String input) {
        char[] letras = input.toCharArray();
        boolean unico;
        int saida = -1;
        for( int i = 0; i < letras.length; i++){
            unico = true;
            for ( int j = 0; j < letras.length; j++){
                if(i == j){
                    continue;
                }
                if( letras[i] == letras[j]){
                    unico = false;
                    break;
                }
            }
            if(unico){
                saida = i;
                break;
            }

        }
        return saida;
    }

    public static String numeroPertenceASequenciaFibonacci(int input) {
        String saida = "0";
        if(input == 0){
            return saida;
        }

        boolean processando = true;
        int anterio = 0, atual = 1, proxima = anterio + atual;
        while(processando){
            if(proxima > input){
                processando = false;
            }else{
                saida = saida.concat(", "+ proxima);
                atual = proxima;
                proxima = anterio + atual;
                anterio = atual;
            }
        }
        return saida;
    }
}
