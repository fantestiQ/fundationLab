package estruturaDeDados_Algoritmos.lista_encadeada;

import java.util.NoSuchElementException;

public class ListaEncadeada {

    public static class No {
        Integer value;
        No proximo;

        public No(Integer value){
            this.value = value;
            proximo = null;
        }
    }

    No cabeca;
    int tamanho;

    public void push(Integer value){
        No novo = new No(value);
        if (cabeca == null){
            cabeca = novo;
        }else {
            No atual = cabeca;
            while (atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    public No pop() {
        if (cabeca == null)
            throw new NoSuchElementException("Lista vazia");

        if (cabeca.proximo == null) {
            No removido = cabeca;
            cabeca = null;
            tamanho--;
            return removido;
        }


        No atual = cabeca;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }

        No removido = atual.proximo;
        atual.proximo = null;
        tamanho--;
        return removido;
    }

    public void insert(int index, No node) {
        validarIndiceInsercao(index);

        if (index == 0) {
            node.proximo = cabeca;
            cabeca = node;
            tamanho++;
            return;
        }

        No anterior = percorrerAte(index - 1);
        node.proximo = anterior.proximo;
        anterior.proximo = node;
        tamanho++;
    }

    public void remove(int index) {
        validarIndice(index);

        if (index == 0) {
            cabeca = cabeca.proximo;
            tamanho--;
            return;
        }

        No anterior = percorrerAte(index - 1);
        No removido = anterior.proximo;
        anterior.proximo = removido.proximo; // "pula" o nó removido
        tamanho--;
    }

    public No elementAt(int index) {
        validarIndice(index);
        return percorrerAte(index);
    }

    public int size() {
        return tamanho;
    }

    public void printList() {
        StringBuilder sb = new StringBuilder("[");
        No atual = cabeca;
        while (atual != null) {
            sb.append(atual.value);
            if (atual.proximo != null)
                sb.append(" -> ");
            atual = atual.proximo;
        }
        sb.append("]");
        System.out.println(sb);
    }

    private No percorrerAte(int index) {
        No atual = cabeca;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    private void validarIndice(int index) {
        if (index < 0 || index >= tamanho)
            throw new IndexOutOfBoundsException("Índice inválido: " + index + ", tamanho: " + tamanho);
    }

    private void validarIndiceInsercao(int index) {
        if (index < 0 || index > tamanho)
            throw new IndexOutOfBoundsException("Índice inválido: " + index + ", tamanho: " + tamanho);
    }


}
