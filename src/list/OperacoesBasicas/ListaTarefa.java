package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;
//    Criando a lista sem precisar de construtor para instanciar uma lista.
//    private List<Tarefa> tarefaList = new ArrayList<>();

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adiconarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
/*
* Metodo removerTarefa aonde recebe um parametro: descricao, logo em seguida cria uma lista: tarefasParaRemover  do tipo: Tarefa vazia,
* criado um forEach para passar dentro da lista: tarefaList com a variavel: t do tipo: Tarefa, dentro do forEach irá verificar através do
* if se dentro da lista: tarefaList contém o parametro: descricao se contiver irá adicionar na lista: tarefasParaRemover, em seguida irá
* passar a lista: tarefasParaRemover como argumento do metodo removeALL para remover de dentro da list: tarefaList
* */
    public void removerTarefa(String descricao) {
//      Criado uma list: tarefasParaRemover do tipo: Tarefas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList) {
//            Se o parametro: descricao for igual ao getDescricao
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
     ListaTarefa listaTarefa = new ListaTarefa();
     listaTarefa.adiconarTarefa("George");
     listaTarefa.adiconarTarefa("Michele");

     listaTarefa.removerTarefa("george");

        System.out.println("Obter número total da lista: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefas();
    }
}
