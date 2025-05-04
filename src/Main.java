import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
        System.out.println("------------------");
        System.out.println("Sistema de Estoque");
        System.out.println("------------------");

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produto");

        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            System.out.println("Digite o código do produto: ");
            String codigoID = sc.nextLine();

            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.println("Digite a descrição do produto: ");
            String descricao = sc.nextLine();

            System.out.println("Digite a quantidade do produto: ");
            int quantidade = sc.nextInt();

            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            //criando um objeto Produto para os dados digitados
            Produto produto = new Produto(codigoID, preco, quantidade, descricao, nome);

            estoque.add(produto);
            System.out.println("Produto cadastrado com sucesso!");

        }

        }
    }
}