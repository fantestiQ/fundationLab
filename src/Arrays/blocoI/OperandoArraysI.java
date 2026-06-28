package Arrays.blocoI;

import java.util.Arrays;
import java.util.Comparator;

public class OperandoArraysI {

    public static void printArraySorted(int[] ints){
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        int x = 0;
        int i = ints.length - 1;
        while (x < i){
            int aux = ints[x];
            ints[x++] = ints[i];
            ints[i--] = aux;
        }
        System.out.println(Arrays.toString(ints));
    }
    public static void apenasTresPrimeirosNumsArr(int[] ints){
        int[] tresNums = Arrays.copyOf(ints, 3);
        for (int tresNum : tresNums) {
            System.out.println(tresNum);
        }
    }

    public static void menorEMaiorValueArr(int[] ints){
        int aux = 0;
        for(int i = 0; i < ints.length; i++){
            for(int j = 0; j < ints.length - 1; j++){
                if (ints[j]> ints[j + 1]){
                    aux = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = aux;
                }
            }
        }
        System.out.println("Menor número: "+ints[0]);
        System.out.println("Maior número: "+ints[ints.length - 1]);
    }

    public static void inverterArr(int[] ints){
        int aux = 0;
        int j = 0;
        int x = ints.length - 1;
        for(int i = 2; i > 0; i--){
            aux = ints[j];
            ints[j] = ints[x];
            ints[x] = aux;
            j++;
            x--;
        }
        for (int nums : ints) {
            System.out.println(nums);
        }
    }
}
