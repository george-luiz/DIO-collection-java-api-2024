package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> listaEstoqueProduto;

    public EstoqueProdutos() {
        this.listaEstoqueProduto = new HashMap<>();
    }


    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        listaEstoqueProduto.put(codigo, new Produto(nome, quantidade, preco));
        System.out.println("O produto foi adicionado.");
    }

    public void exibirProdutos() {
        System.out.println("Exibindo os produtos em estoque: " + listaEstoqueProduto);
    }

    public void calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if(!listaEstoqueProduto.isEmpty()) {
            for (Produto produto: listaEstoqueProduto.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
            System.out.println("Valor total do estoque:");
        } else {
            throw new RuntimeException("Ao calcular o valor total em estoque o map está vazio!");
        }
    }

    public void obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double mairoPreco = Double.MIN_VALUE;
        if(!listaEstoqueProduto.isEmpty()) {
            for (Produto produto: listaEstoqueProduto.values()) {
                if(produto.getPreco() > mairoPreco) {
                    produtoMaisCaro = produto;
                }
            }

            System.out.println("O produto mais caro: " + produtoMaisCaro);
        } else {
            throw new RuntimeException("Ao obter o produto mais caro no estoque o map está vazio!");
        }
    }

    public void obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!listaEstoqueProduto.isEmpty()) {
            for (Produto produto: listaEstoqueProduto.values()) {
                if(produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                }
            }

            System.out.println("O produto mais barato: " + produtoMaisBarato);
        } else {
            throw new RuntimeException("Ao obter o produto mais barato no estoque o map está vazio!");
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(001, "Sabão", 10, 0.5);
        estoqueProdutos.adicionarProduto(010, "Pasta de dente", 5, 2.5);
        estoqueProdutos.adicionarProduto(050, "Escova", 1, 10);
        estoqueProdutos.exibirProdutos();
        estoqueProdutos.calcularValorTotalEstoque();
        estoqueProdutos.obterProdutoMaisCaro();
        estoqueProdutos.obterProdutoMaisBarato();
    }
}
