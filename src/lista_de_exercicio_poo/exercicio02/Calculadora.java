package lista_de_exercicio_poo.exercicio02;

public class Calculadora {

    private int valor1;
    private int valor2;

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int somar(int valor1, int valor2){
        return valor1 + valor2;

    } public int subtrair(int valor1, int valor2){
        return valor1 - valor2;

    } public int multiplicar(int valor1, int valor2){
        return valor1 * valor2;

    } public int dividir(int valor1, int valor2){
        return valor1 / valor2;

    }

}
