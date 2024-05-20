package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> listaAlunos = new HashSet<>();

    public void adicionarAluno(String nome, long matricula, int nota) {
        listaAlunos.add(new Alunos(nome, matricula, nota));
    }

    public void exibirAlunos() {
        System.out.println("Lista de alunos: " + listaAlunos);
    }

    public void removerAluno(long matricula) {
        if(!listaAlunos.isEmpty()) {
            for (Alunos aluno: listaAlunos) {
                if(aluno.getMatricula() == matricula) {
                    listaAlunos.remove(aluno);
                }
            }
        } else {
            throw new RuntimeException("Ao remover o aluno a lista está vazia!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(listaAlunos);
        System.out.println("Lista de alunos por nome: " + alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparetorAlunosPorNota());
        alunosPorNota.addAll(listaAlunos);
        System.out.println("Lista de alunos por nota: " + alunosPorNota);
    }



    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("George", 003, 10);
        gerenciadorAlunos.adicionarAluno("Michele", 001, 8);
        gerenciadorAlunos.adicionarAluno("Heloisa", 002, 5);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(003);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
