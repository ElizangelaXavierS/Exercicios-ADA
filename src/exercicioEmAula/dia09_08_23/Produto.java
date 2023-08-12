package exercicioEmAula.dia09_08_23;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    public Produto(){};
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("--------------------");
        System.out.println("- Dados do Produto -");
        System.out.println("--------------------");
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
}
