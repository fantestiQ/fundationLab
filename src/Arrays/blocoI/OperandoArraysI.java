package Arrays.blocoI;

import java.util.Arrays;
import java.util.Comparator;

public class OperandoArraysI {

    public static void printArraySorted(int[] ints){
        StringBuilder sbCres = new StringBuilder();
        Arrays.sort(ints);
        int i = 0;
        for (int num : ints){
            sbCres.append(num);
            if (i < ints.length -1) sbCres.append(",");
            i++;
        }
        System.out.println(sbCres.toString());
        System.out.println(sbCres.reverse().toString());

    }
}
