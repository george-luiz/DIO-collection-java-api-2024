package list.Ordenacao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumerosInteiros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        listaNumerosInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumerosInteiros);
        if (!listaNumerosInteiros.isEmpty()) {
            Collections.sort(numerosAscendente);
            Collections.sort(numerosAscendente, Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.listaNumerosInteiros);
        if (!listaNumerosInteiros.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());// Ou Collections.sort(numerosDescendente, Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if(!listaNumerosInteiros.isEmpty()) {
            System.out.println("Lista de números: " + listaNumerosInteiros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);

        System.out.println("Lista descendebte: " +  ordenacaoNumeros.ordenarDescendente());
        System.out.println("Lista ascendente: " +  ordenacaoNumeros.ordenarAscendente());
    }

}
