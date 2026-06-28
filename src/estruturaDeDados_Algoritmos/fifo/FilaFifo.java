package estruturaDeDados_Algoritmos.fifo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FilaFifo {
    private final List<Integer> fila = new ArrayList<>();

    public void enqueue(Integer value){
        fila.add(value);
    }

    public Integer dequeue(){
        if (fila.isEmpty())
            throw new NoSuchElementException("Fila vazia");
        return fila.remove(0);
    }

    public Integer rear(){
        if (fila.isEmpty())
            throw new NoSuchElementException("Fila vazia");
        return fila.get(fila.size() -1);
    }

    public Integer front(){
        if (fila.isEmpty())
            throw new NoSuchElementException("Fila vazia");
        return fila.get(0);
    }

    public int size(){
        return fila.size();
    }

    public boolean isEmpty(){
        return fila.isEmpty();
    }

    @Override
    public String toString() {
        return "FilaFifo{" +
                "fila=" + fila +
                '}';
    }
}
