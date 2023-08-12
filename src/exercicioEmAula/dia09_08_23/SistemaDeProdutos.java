package exercicioEmAula.dia09_08_23;


import java.util.ArrayList;

public class SistemaDeProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto Cadastrado com sucesso! ");

    }

    public Produto buscarPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos() {
        System.out.println("-------------------------");
        System.out.println("-   Lista de Produtos   -");
        System.out.println("-------------------------");
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
        }
    }
    public void atualizarProduto(Produto produto, String nome, double preco){
        produto.setNome(nome);
        produto.setPreco(preco);

    }


    public void deletarProduto(int id) {
        Produto produto = this.buscarPorId(id);

        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto deletado com sucesso!");
        } else {
            System.out.println("Produto não encontrado");

        }


    }
}


