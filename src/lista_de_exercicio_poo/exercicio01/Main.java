package lista_de_exercicio_poo.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int  idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura= sc.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso= sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome,idade, altura,peso);

        pessoa.exibirInformacoes();
    }
}
