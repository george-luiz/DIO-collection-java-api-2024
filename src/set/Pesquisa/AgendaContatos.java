package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> listaAgendaContatos;

    AgendaContatos() {
        this.listaAgendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        listaAgendaContatos.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        System.out.println("Exibindo todos os contatos da lista: " + listaAgendaContatos);
    }

    public void pesquisarPorNome(String nome) {
        if(!listaAgendaContatos.isEmpty()) {
            for (Contato contato: listaAgendaContatos) {
                if(contato.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Encontrado o nome: " + contato);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Na pesquisa por nome a lista está vazia!");
        }
    }

    public void atualizarNumeroContato( String nome, int numeroTelefone) {
        if(!listaAgendaContatos.isEmpty()) {
            for (Contato contato: listaAgendaContatos) {
                if(contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumeroTelefone(numeroTelefone);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Em Atualizar o número do contato a lista está vazia!");
        }
    }

    public static void main(String[] args) {
        var agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("George", 981635005);
        agendaContatos.adicionarContato("Michele", 981635004);
        agendaContatos.adicionarContato("Heloisa", 981635003);
        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("heloisa");
        agendaContatos.atualizarNumeroContato("george", 1981635005);
        agendaContatos.exibirContatos();
    }
}
