package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> listaDicionario = new HashMap<>();

    public void exibirDicionario() {
        System.out.println("Exibindo dicionario: " + listaDicionario);
    }

    public void adicionarPalavra(String palavra, String significado) {
        listaDicionario.put(palavra, significado);
        System.out.println("a Palavra foi adicionado ao dicionario!");
    }

    public void removerPalavra(String palavra) {
        if(!listaDicionario.isEmpty()) {
            listaDicionario.remove(palavra);
            System.out.println("Palavra removido do dicionario!");
        } else {
            throw new RuntimeException("Ao remover a palavra o Map está vazio!");
        }
    }

    public void pesquisarPorPalavra(String palavra) {
        String significado = "";
        if(!listaDicionario.isEmpty()) {
            significado = listaDicionario.get(palavra);
            System.out.println("O significado da palavra: " + palavra + " = " + significado);
        } else {
            throw new RuntimeException("Ao remover a palavra o Map está vazio!");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Por que", "Por que (separado e sem acento) pode ser usado para introduzir uma pergunta");
        dicionario.adicionarPalavra("Porque", "Porque (junto e sem acento) é usado principalmente em respostas e em explicações");
        dicionario.exibirDicionario();
        dicionario.pesquisarPorPalavra("Por que");
        dicionario.removerPalavra("Por que");
    }
}
