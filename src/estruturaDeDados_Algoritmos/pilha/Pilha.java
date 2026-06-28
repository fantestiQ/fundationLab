package estruturaDeDados_Algoritmos.pilha;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Pilha {
    private List<Integer> pilha = new ArrayList<>();
    private int topo =  0;

    public void push(Integer num){
        pilha.add(num);
        ajustaTopo();
    }
    public Integer pop(){
        if (pilha.isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        Integer value = pilha.get(topo);
        pilha.remove(topo);
        ajustaTopo();
        return value;
    }

    public Integer top(){
        if (pilha.isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        return pilha.get(topo);
    }

    public boolean isEmpty(){
        return pilha.isEmpty();
    }

    public int size(){
        return pilha.size();
    }

    public void ajustaTopo(){
        topo = pilha.size() - 1;

        if (topo < 0)
            topo = 0;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "pilha=" + pilha +
                ", topo=" + topo +
                '}';
    }
}
