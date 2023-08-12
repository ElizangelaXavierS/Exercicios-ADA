package lista_de_exercicio_poo.exercicio03;

public class ParOuImpar {
     int numero;

    public ParOuImpar(int numero) {
        this.numero = numero;
    }

    public void numeroParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O " + numero + " é Par");
        } else {
            System.out.println("O " + numero + " é Impar");
        }


    }
}
