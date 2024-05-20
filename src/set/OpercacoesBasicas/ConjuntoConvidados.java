package set.OpercacoesBasicas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet = new HashSet<>();

    public void adicionarConvidados(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
            Convidado convidadoParaRemover = null;

        if(!convidadoSet.isEmpty()) {
            for (Convidado convidado: convidadoSet) {
                if(convidado.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = convidado;
                    convidadoSet.remove(convidadoParaRemover);
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println("Lista de convidados: " + convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidados("George", 05);
        conjuntoConvidados.adicionarConvidados("Michele", 01);
        conjuntoConvidados.adicionarConvidados("Heloisa", 02);

        System.out.println("Total de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.removerConvidadoPorCodigoConvite(05);
        System.out.println("Total de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidado();

    }


}
