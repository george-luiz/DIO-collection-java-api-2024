package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInteiros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;
        if(!numerosInteiros.isEmpty()) {
            for (int numeros: numerosInteiros) {
                somaTotal += numeros;
            }
        } else {
            System.out.println("A lista está vazia e não calculou.");
        }

        return somaTotal;
    }

    public void encontrarMaiorNumero() {

       int maiorNumero = Integer.MIN_VALUE; // MIN_VALUE: vai retornar o menor numero possivel
        for (int numero: numerosInteiros) {
            if (numero >= maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior valor da lista: " + maiorNumero);
    }

    public void encontrarMenorNumero() {

        int menorNumero = Integer.MAX_VALUE; // MAX_VALUE: vai retornar o maior numero possivel
        for (int numero: numerosInteiros) {
            if (numero <= menorNumero) {
                menorNumero = numero;
            }
        }

        System.out.println("O menor valor da lista: " + menorNumero);
    }

    public void exibirNumeros() {
        System.out.println("A lista de números inteiros:" + numerosInteiros);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);
        System.out.println("Soma total: " + somaNumeros.calcularSoma());;

        somaNumeros.exibirNumeros();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
    }
}
