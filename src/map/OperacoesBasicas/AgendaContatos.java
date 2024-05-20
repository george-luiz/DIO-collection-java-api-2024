package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void exibirContato() {
        System.out.println("Exibir contatos da lista: " + agendaContatoMap);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            throw new RuntimeException("Ao remover o contato a lista está vazia!");
        }
    }

    public void pesquisaPorNome(String nome) {
        int numeroTelefone = 0;
        if(!agendaContatoMap.isEmpty()) {
            numeroTelefone = agendaContatoMap.get(nome);//Pesquisado por chave(nome) e devolvido o valor
            System.out.println("Pesquisa por nome: " + numeroTelefone);
        } else {
            throw new RuntimeException("Ao pesquisar o contato a lista está vazia!");
        }
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("George", 98163505);
        agendaContatos.adicionarContato("Michele", 942575008);
        agendaContatos.adicionarContato("Heloisa", 42072348);
        agendaContatos.exibirContato();
        agendaContatos.removerContato("George");
        agendaContatos.exibirContato();
        agendaContatos.pesquisaPorNome("Michele");
    }
}
