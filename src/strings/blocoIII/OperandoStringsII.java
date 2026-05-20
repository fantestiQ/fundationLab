package strings.blocoIII;

import strings.OperandoStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperandoStringsII {

    public static void removeEspacosStringAllUpper(String s){
        System.out.println(s.strip().toUpperCase());
    }

    public static void concatenaStrings(List<String> strings){
        System.out.println(String.join(" | ", strings));
    }

    public static void validaSeComecaETerminaMesmoChar(String s){
        s = s.toLowerCase();
        String primeiroChar = String.valueOf(s.charAt(0));
        boolean terminaIgual = true;
        if (s.endsWith(primeiroChar)){
            System.out.printf("A string '%s' começa e termina  com o mesmo caractere? ".formatted(s) + terminaIgual);
        }else {
            terminaIgual = false;
            System.out.println("A string '%s' começa e termina  com o mesmo caractere? ".formatted(s) + terminaIgual);
        }
    }

    public static void inverteCadaPalavra(String s){
        List<String> strings = Arrays.asList(s.split(" "));
        StringBuilder sb = new StringBuilder();

        strings.forEach(s1 -> {
            sb.append(new StringBuilder(s1).reverse());
            sb.append(" ");
        });
        System.out.println(sb.toString());

//        String invertida = "";
//        for (String s1 : strings) {
//            invertida = OperandoStrings.printStringAvesso(s);
//        }
//        List<String> stringsInvertidas = Arrays.asList(invertida.split(" "));
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = stringsInvertidas.size() - 1; i >= 0 ; i-- ){
//            sb.append(stringsInvertidas.get(i)).append(" ");
//        }
//        System.out.println(sb.toString());
    }

}
