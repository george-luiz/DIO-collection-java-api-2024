package set.Pesquisa;

import list.OperacoesBasicas.ListaTarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefa = new HashSet<>();

    public void adicionarTarefa(String descricao, boolean tarefaConcluida) {
        listaTarefa.add(new Tarefa(descricao, tarefaConcluida));
    }

    public void exibirTarefas() {
        System.out.println("Exibindo todas as tarefas: " + listaTarefa);
    }

    public void removerTarefa(String descricao) {
        if (!listaTarefa.isEmpty()) {
            for (Tarefa tarefa : listaTarefa) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    listaTarefa.remove(tarefa);
                    System.out.println("Tarefa foi removida.");
                }
            }
        } else {
            throw new RuntimeException("Em remover tarefas a lista está vazia!");
        }
    }

    public void contarTarefas() {
        System.out.println("Total de todas as tarefas são: " + listaTarefa.size());
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!listaTarefa.isEmpty()) {
            for (Tarefa tarefa : listaTarefa) {
                if (tarefa.getTarefaConcluida() == true) {
                    tarefasConcluidas.add(tarefa);
                    System.out.println("Lista com as tarefas concluidas: " + tarefasConcluidas);
                }
            }
        } else {
            throw new RuntimeException("Em obter tarefasConcluidas a lista está vazia!");
        }
    }

    public void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!listaTarefa.isEmpty()) {
            for (Tarefa tarefa : listaTarefa) {
                if (tarefa.getTarefaConcluida() == false) {
                    tarefasPendentes.add(tarefa);
                    System.out.println("Lista com as tarefas pendentes: " + tarefasPendentes);
                }
            }
        } else {
            throw new RuntimeException("Em obter tarefas pendentes a lista está vazia!");
        }
    }

    public void limparListaTarefas() {
        if (!listaTarefa.isEmpty()) {
            listaTarefa.removeAll(listaTarefa);
            System.out.println("A lista tarefas está vazia.");
        } else {
            throw new RuntimeException("Em limpar a lista tarefas a lista está vazia!");
        }
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar Java", true);
        listaTarefas.adicionarTarefa("Estudar Javascript", false);
        listaTarefas.adicionarTarefa("Estudar Banco de dados", false);
        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("estudar javascript");
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();
        listaTarefas.limparListaTarefas();

    }
}
