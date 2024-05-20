package set.OpercacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> listaPalavrasUnicas = new HashSet<>();

    public void adicionarPalavra(String palavra) {
        listaPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!listaPalavrasUnicas.isEmpty()) {
            for (String p: listaPalavrasUnicas) {
                if(p.equalsIgnoreCase(palavra)) {
                    listaPalavrasUnicas.remove(p);
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void verificarPalavra(String palavra) {
        String palavraEncontrada = "";
        if (!listaPalavrasUnicas.isEmpty()) {
            for (String p: listaPalavrasUnicas) {
                if(p.equalsIgnoreCase(palavra)) {
                    palavraEncontrada = p;
                    System.out.println("Palavra presente no conjunto: " + palavraEncontrada);
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println("lista de palabras unicas: " + listaPalavrasUnicas);
    }

    public static void main(String[] args) {
        var conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("George");
        conjuntoPalavrasUnicas.adicionarPalavra("Michele");
        conjuntoPalavrasUnicas.adicionarPalavra("Heloisa");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("michele");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("George");

    }
}
