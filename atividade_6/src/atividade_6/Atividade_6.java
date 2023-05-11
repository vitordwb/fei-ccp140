/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unievwatanabe
 */
public class Atividade_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alimento> cardapio = new ArrayList<Alimento>();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        while (true) {
        System.out.println("\nEscolha uma opcao:");
        System.out.println("n - Cadastre um novo produto no Cardapio");
        System.out.println("d - Deleta um Produto do Cardapio");
        System.out.println("a - Atualiza o preco do produto no Cardapio");
        System.out.println("p - Imprime todo o Cardapio");
        System.out.println("s - Imprime um Alimento do Cardapio");
        System.out.println("q - Sai do programa");

        opcao = scanner.nextLine();

        switch (opcao) {
            case "n":
                System.out.println("\nDigite o nome do produto:");
                String produto = scanner.nextLine();
                System.out.println("Digite o preco do produto:");
                double preco = scanner.nextDouble();
                scanner.nextLine();
                Alimento novoAlimento = new Alimento(produto, preco);
                cardapio.add(novoAlimento);
                System.out.println("\nProduto adicionado com sucesso!");
                break;
            case "d":
                System.out.println("\nDigite o nome do produto a ser excluido:");
                String nomeProduto = scanner.nextLine();
                boolean produtoRemovido = false;
                for (int i = 0; i < cardapio.size(); i++) {
                    if (cardapio.get(i).getProduto().equals(nomeProduto)) {
                        cardapio.remove(i);
                        System.out.println("\nProduto removido com sucesso!");
                        produtoRemovido = true;
                        break;
                    }
                }
                if (!produtoRemovido) {
                    System.out.println("\nProduto nao encontrado no cardapio!");
                }
                break;
            case "a":
                System.out.println("\nDigite o nome do produto a ser atualizado:");
                nomeProduto = scanner.nextLine();
                boolean produtoAtualizado = false;
                for (int i = 0; i < cardapio.size(); i++) {
                    if (cardapio.get(i).getProduto().equals(nomeProduto)) {
                        System.out.println("\nDigite o novo preco do produto:");
                        preco = scanner.nextDouble();
                        scanner.nextLine();
                        cardapio.get(i).setPreco(preco);
                        System.out.println("\nProduto atualizado com sucesso!");
                        produtoAtualizado = true;
                        break;
                    }
                }
                if (!produtoAtualizado) {
                    System.out.println("\nProduto nao encontrado no cardapio!");
                }
                break;
            case "p":
                System.out.println("====== CARDAPIO ======");
                for (Alimento alimento : cardapio) { 
                    System.out.println(alimento);
                }
                System.out.println("======================");
                break;
            case "s":
                System.out.println("\nDigite o nome do produto a ser exibido:");
                nomeProduto = scanner.nextLine();
                boolean produtoEncontrado = false;
                for (int i = 0; i < cardapio.size(); i++) {
                    if (cardapio.get(i).getProduto().equals(nomeProduto)) {
                        System.out.println("\n" + cardapio.get(i));
                        produtoEncontrado = true;
                        break;
                    }
                }
                if (!produtoEncontrado) {
                    System.out.println("\nProduto nao encontrado no cardapio!");
                }
                break;
            case "q":
                System.out.println("\nPrograma encerrado!");
                return;
            default:
                System.out.println("\nOpcao invalida!");
                break;
            }
        }
    }
}
