package lista_de_exercicio_poo.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número e decubra se ele é impar ou par!");
        int numero = sc.nextInt();

        ParOuImpar parOuImpar = new ParOuImpar(numero);

        parOuImpar.numeroParOuImpar(numero);
    }
}
