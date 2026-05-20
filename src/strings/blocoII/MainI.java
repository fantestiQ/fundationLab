package strings.blocoII;

import strings.OperandoStrings;

public class MainI {
    public static void main(String[] args) {
        String s1 ="java,python,kotlin,javascript";
        OperandoStringsI.separadorListaStrings(s1);
        System.out.println("=============");
        String s2 = "Eu amo Java e Java é incrível";
        System.out.println(OperandoStringsI.substituiTermoStrings(s2,"Java", "Kotlin"));
        System.out.println("=============");
        String s3 = "banana";
        OperandoStringsI.encontraOcorrenciasString(s3,"a");
        System.out.println("=============");
        String s4 = "olá mundo java mundo";
        OperandoStringsI.validaOcorrenciasString(s4,"mundo");
    }
}
