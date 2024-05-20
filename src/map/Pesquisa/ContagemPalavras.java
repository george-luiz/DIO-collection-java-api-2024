package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> listaContagemPalavras = new HashMap<>();

    public void adicionarPalavra(String palavra, int quantidade) {
        listaContagemPalavras.put(palavra, quantidade);
    }

    public void exibirContagemPalavras() {
        System.out.println("Todas a palavras contadas da lista: " + listaContagemPalavras);
    }

    public void removerPalavra (String palavra) {
       if(!listaContagemPalavras.isEmpty()) {
           listaContagemPalavras.remove(palavra);
       } else {
           throw new RuntimeException("Ao remover a palavra o map está vazio!");
       }
    }

    public void encontrarPalavraMaisFrequente() {
       int palavraFrequente = Integer.MIN_VALUE;
       if(!listaContagemPalavras.isEmpty()) {
           for (int palavra: listaContagemPalavras.values()) {
               if(palavra > palavraFrequente) {
                   palavraFrequente = palavra;
               }
           }

           System.out.println("A palavra mais frequente encontrada é " + palavraFrequente);
       } else {
           throw new RuntimeException("Ao encontrar a plavra mais frequente o map está vazio!");
       }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("George", 10);
        contagemPalavras.adicionarPalavra("Michele", 5);
        contagemPalavras.adicionarPalavra("Heloisa", 3);
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.encontrarPalavraMaisFrequente();
        contagemPalavras.removerPalavra("Heloisa");
        contagemPalavras.exibirContagemPalavras();
    }
}
