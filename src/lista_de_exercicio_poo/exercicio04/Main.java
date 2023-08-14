package lista_de_exercicio_poo.exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da força: ");
        double forca = sc.nextDouble();

        System.out.println("Digite o valor da massa: ");
        double massa = sc.nextDouble();

        Aceleracao aceleracao  = new Aceleracao(forca, massa);

        System.out.println(aceleracao.calculaAceleracao(forca, massa));
    }
}
