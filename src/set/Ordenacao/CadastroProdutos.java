package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaCadastroProduto;

    CadastroProdutos() {
        this.listaCadastroProduto = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        listaCadastroProduto.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println("Exibindo lista de produtos: " + listaCadastroProduto);
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> ordenacaoAlunosPorNome = new TreeSet<>(listaCadastroProduto);// TreeSet: Já ordena automaticamente, como o Comparable na classe: Produto está por nome o TreeSet já identifica
        return ordenacaoAlunosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(listaCadastroProduto);
        return produtosPorPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Produto 5", 1L, 15d, 5);
        cadastroProdutos.adicionarProduto("Produto 0", 2L, 20d, 10);
        cadastroProdutos.adicionarProduto("Produto 3", 1L, 10d, 2);
        cadastroProdutos.adicionarProduto("Produto 9", 9L, 2d, 2);

        cadastroProdutos.exibirProdutos();
        System.out.println("Ordenação por nome: " + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Ordenação por preço: " + cadastroProdutos.exibirProdutosPorPreco());
    }
}
