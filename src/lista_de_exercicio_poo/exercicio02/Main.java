package lista_de_exercicio_poo.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o primeiro número: ");
        int numero2 = sc.nextInt();

        Calculadora calculadora = new Calculadora(numero1, numero2);

        System.out.println(calculadora.somar(numero1, numero2));
        System.out.println(calculadora.subtrair(numero1, numero2));
        System.out.println(calculadora.multiplicar(numero1, numero2));
        System.out.println(calculadora.dividir(numero1, numero2));
    }
}
