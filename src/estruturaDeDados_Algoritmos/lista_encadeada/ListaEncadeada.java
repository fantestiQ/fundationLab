package estruturaDeDados_Algoritmos.lista_encadeada;

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

    public void add(Integer value){
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


}
