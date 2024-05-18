package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens = new ArrayList<>();

    public void adicionarItens(String nome, double preco, int quantidade) {
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
//        listaDeItens.remove(new Item(nome, preco, quantidade));
        List<Item> removerListaDeItens = new ArrayList<>();

        if(!listaDeItens.isEmpty()) {
            for (Item item: listaDeItens) {
                if(item.getNome().equalsIgnoreCase(nome)) {
                    removerListaDeItens.add(item);
                }
            }

            listaDeItens.removeAll(removerListaDeItens);
        }

    }

    public void calcularValorTotal() {
        double valorTotal = 0;

        for (Item item: listaDeItens) {
            valorTotal += (item.getPreco() * item.getQuantidade());
        }

        System.out.println("Valor total: " + valorTotal);
    }

    public void exibirItens() {
        System.out.println(listaDeItens);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItens("Sabonete", 2.00, 2);
        carrinhoDeCompras.adicionarItens("Sabonete", 2.00, 2);
        carrinhoDeCompras.adicionarItens("Arroz", 20.00, 1);
        carrinhoDeCompras.adicionarItens("Chocolate", 5, 5);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Chocolate");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}

