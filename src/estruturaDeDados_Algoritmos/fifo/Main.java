package estruturaDeDados_Algoritmos.fifo;

public class Main {
    public static void main(String[] args) {
        FilaFifo fila = new FilaFifo();

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println(fila);

        fila.dequeue();

        System.out.println(fila);

        fila.dequeue();

        System.out.println(fila);

        fila.enqueue(40);

        System.out.println("Retorna o inteiro no final da fila: "+fila.rear()+"\n");
        System.out.println("Retorna o inteiro no começo da fila: "+fila.front()+"\n");
        System.out.println("Retorna o tamanho da fila: "+fila.size()+"\n");

        System.out.println(fila);

        System.out.println("A fila está vazia? "+fila.isEmpty()+"\n");




    }
}
