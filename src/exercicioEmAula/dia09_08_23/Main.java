package exercicioEmAula.dia09_08_23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        SistemaDeProdutos sistemaDeProdutos = new SistemaDeProdutos();

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("------- SISTEMA DE PRODUTOS-------");
            System.out.println("-                                -");
            System.out.println("-      1- Cadastrar Produto      -");
            System.out.println("-      2- Buscar Produto         -");
            System.out.println("-      3- Listar Produtos        -");
            System.out.println("-      4- Atualizar Produto      -");
            System.out.println("-      5- Excluir Produto        -");
            System.out.println("-      6- Sair                   -");
            System.out.println("-                                -");
            System.out.println("----------------------------------");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: {
                    Produto produto = new Produto();
                    System.out.println("-----Cadastro de Produto-----");

                    System.out.println("Digite o id do produto: ");
                    produto.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Digite o nome do produto: ");
                    produto.setNome(sc.nextLine());


                    System.out.println("Digite o preço do produto: ");
                    produto.setPreco(sc.nextDouble());

                    sistemaDeProdutos.cadastrarProduto(produto);
                    break;
                }
                case 2: {
                    System.out.println("Digite o id a ser encontrado:");
                    int id = sc.nextInt();
                    Produto produto = sistemaDeProdutos.buscarPorId(id);
                    if (produto != null) {
                        produto.exibirInformacoes();
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                }
                case 3: {
                    sistemaDeProdutos.listarProdutos();
                    break;
                }
                case 4: {
                    System.out.println("Digite o id do produto que deseja atualizar: ");
                    int id = sc.nextInt();
                    Produto produto = sistemaDeProdutos.buscarPorId(id);
                    if (produto != null) {
                        produto.exibirInformacoes();
                        sc.nextLine();

                        System.out.println("Digite o novo nome: ");
                        String novoNome = sc.nextLine();


                        System.out.println("Digite o novo preco: ");
                        double novoPreco = sc.nextDouble();

                        sistemaDeProdutos.atualizarProduto(produto, novoNome, novoPreco);

                    } else {
                        System.out.println("Id não encontrado!");
                    }

                    break;

                }
                case 5: {
                    System.out.println("Digite o id do produto que deseja deletar: ");
                    int id = sc.nextInt();
                    sistemaDeProdutos.deletarProduto(id);
                    break;
                }

                case 6: {
                    System.out.println("Volte Sempre!");
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }


        }
    }
}
