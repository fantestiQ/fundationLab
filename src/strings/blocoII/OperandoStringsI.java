package strings.blocoII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OperandoStringsI {

    public static void separadorListaStrings(String s){
        List<String> strings = Arrays.stream(s.split(",")).toList();
        strings.forEach(System.out::println);
    }

    public static String substituiTermoStrings(String s, String termo, String termoSub){
        return s.replace(termo, termoSub);
    }

    public static void encontraOcorrenciasString(String s, String oc){
//       List<Integer> indices = new ArrayList<>();
//       indices.add(s.indexOf(oc));
//       int i = 0;
//       while (s.indexOf(oc, i) != -1){
//           indices.add(s.indexOf(oc, i));
//           i += oc.length();
//       }
//        new HashSet<>(indices).forEach(System.out::println);
        int i = 0;
        while ((i = s.indexOf(oc, i)) != -1) {
            System.out.println(i);
            i += oc.length(); // avança para depois da ocorrência atual
        }
    }

    public static void validaOcorrenciasString(String s, String oc){
        int value = s.indexOf(oc);
        if(value != -1 && s.indexOf(oc, value += oc.length()) != -1){
            encontraOcorrenciasString(s, oc);
        }
    }

}
