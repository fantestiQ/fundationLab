package estruturaDeDados_Algoritmos.pilha;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push(10);
        pilha.push(2);
        pilha.push(15);

        System.out.println(pilha);

        Integer valorRemovido = pilha.pop();
        System.out.println("valor removido: "+valorRemovido + "\n");
        System.out.println(pilha);

         valorRemovido = pilha.pop();
        System.out.println("valor removido: "+valorRemovido+ "\n");
        System.out.println(pilha);

        valorRemovido = pilha.pop();
        System.out.println("valor removido: "+valorRemovido+ "\n");
        System.out.println(pilha + "\n");

        pilha.push(30);
        pilha.push(25);
        System.out.println(pilha+ "\n");

        System.out.println("Item no topo da lista:"+pilha.top()+"\n");
        System.out.println("A lista está vazia? "+pilha.isEmpty()+"\n");

        pilha.pop();
        pilha.pop();

        System.out.println("E agora a lista está vazia? "+pilha.isEmpty()+"\n");

        pilha.push(30);
        pilha.push(25);

        System.out.println("Quantidade de itens na pilha: "+pilha.size()+"\n");

    }

}
