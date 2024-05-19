package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
     private List<Livro> listaLivros;

    public CatalagoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for (Livro livro: listaLivros) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }

        return livrosPorAutor;
    }


    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro livro: listaLivros) {
                if(livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }

        return livrosPorIntervaloAnos;
    }


    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaLivros.isEmpty()) {
            for (Livro livro: listaLivros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                   livroPorTitulo = livro;
                   break;
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }

        return livroPorTitulo;
    }


    public static void main(String[] args) {
        var catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Teste", "George", 1995);
        catalagoLivros.adicionarLivro("Teste1", "Michele", 1995);

        System.out.println("Pesquisa: " + catalagoLivros.pesquisaPorTitulo("teste"));
        System.out.println("Pesquisa por ano: " + catalagoLivros.pesquisaPorIntervaloAnos(1900, 1999));
        System.out.println("Pesquisa por autor: " + catalagoLivros.pesquisarPorAutor("george"));
    }
}
