package Arrays.blocoI;

public class MainArrays {
    public static void main(String[] args) {
        System.out.println("Array ordenado crescente e decrescente");
        int[] ints = {5, 3, 8, 1, 9, 2};
        OperandoArraysI.printArraySorted(ints);

        System.out.println("\nArray três primeiros elementos");
        int[] intsI = {1, 2, 3, 4, 5};
        OperandoArraysI.apenasTresPrimeirosNumsArr(intsI);

        System.out.println("\nBuscando Maior e Menor Elemento");
        int[] intsII = {4, 2, 7, 1, 9, 3};
        OperandoArraysI.menorEMaiorValueArr(intsII);

        System.out.println("\nInvertaendo Array");
        int[] intsIII = {1, 2, 3, 4, 5};
        OperandoArraysI.inverterArr(intsIII);
    }
}
