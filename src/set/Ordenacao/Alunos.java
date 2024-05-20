package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {
    private String nome;
    private long matricula;
    private int nota;

    public Alunos(String nome, long matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return getMatricula() == alunos.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "{nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota + "}";
    }

    @Override
    public int compareTo(Alunos alunos) {
        return nome.compareToIgnoreCase(alunos.getNome());
    }
}

class ComparetorAlunosPorNota implements Comparator<Alunos> {

    @Override
    public int compare(Alunos aluno1, Alunos alunos2) {
        return Double.compare(aluno1.getNota(), alunos2.getNota());
    }
}
