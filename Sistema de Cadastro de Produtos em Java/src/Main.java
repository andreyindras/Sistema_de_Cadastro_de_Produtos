import entities.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Map<Integer, Produto> hashProdutos = new HashMap<>();

        do {
            System.out.println("\nMenu");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opção de cadastro selecionada.");

                    System.out.print("Digite o codigo do produto: ");
                    int codigo = scanner.nextInt();

                    System.out.print("Digite o nome do produto: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();

                    Produto produto = new Produto(codigo, nome, preco);
                    hashProdutos.put(codigo, produto);

                    System.out.println("Produto cadastrado!");

                    break;
                case 2:
                    System.out.println("Opção de busca selecionada.");

                    System.out.print("Digite o código do produto: ");
                    int busc = scanner.nextInt();

                    Produto buscProduto = hashProdutos.get(busc);

                    if (buscProduto != null) {
                        System.out.println("\nProduto encontrado: " + buscProduto.toString());
                    } else {
                        System.out.println("\nProduto não encontrado!");
                    }

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}