package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    ArrayList<Pessoa> pessoaList = new ArrayList<>();

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {

        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {

        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("George", 28, 1.73);
        ordenacaoPessoa.adicionarPessoa("Michele", 28, 1.72);
        ordenacaoPessoa.adicionarPessoa("Heloisa", 7, 1.10);

        System.out.println("Ordenar por Idade: " + ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordenar por Altura: " + ordenacaoPessoa.ordenarPorAltura());
    }
}
