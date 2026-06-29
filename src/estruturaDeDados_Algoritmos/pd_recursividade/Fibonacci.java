package estruturaDeDados_Algoritmos.pd_recursividade;

import java.util.Arrays;

public class Fibonacci {
   private static final int  MAX_ELEMENTS = 100;
   private static final long[] elements = new long[MAX_ELEMENTS];

   public static long encontraElementoPD(int n){
       Arrays.fill(elements, -1);

       return encontrarElemento(n);
   }

   public static long encontrarElemento(int n){
      if (elements[n]== -1){
         if(n <= 1){
            elements[n] = n;
         }else{
            elements[n] = encontrarElemento(n - 1) + encontrarElemento(n - 2);
         }
      }
      return elements[n];
   }

   public static void main(String[] args) {
      int n = 20;

      System.out.println(encontraElementoPD(n));
   }

}
