package estruturaDeDados_Algoritmos.pd_recursividade;

import java.util.*;

public class FatorialRecursao {

     static List<Long> multiplicacoes = new ArrayList<>();
     static Map<Integer, Long> memoria = new HashMap<>();

     // fatorial iterativo com stream
    public static long fatorial(int n){
        if(n <= 1){
            return 1;
        }
        for (long  i = n; i > 0; i--) {
            multiplicacoes.add(i);
        }
        Optional<Long> reduce =multiplicacoes.stream().reduce(((aLong, aLong2) -> aLong*aLong2));
        return reduce.orElseThrow();
    }

    public static long fatorialRecursivo(int n){
        if(n <= 1){
            return 1;
        }

        if (memoria.containsKey(n)){
            return memoria.get(n);
        }
        memoria.put(n,n * fatorialRecursivo(n -1));
        return memoria.get(n);
    }

    public static void main(String[] args) {
        System.out.println(fatorialRecursivo(100));
    }
}
