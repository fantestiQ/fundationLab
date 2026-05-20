package strings;

import java.util.HashMap;
import java.util.Map;

public class OperandoStrings {

    public static void printCoutCaracteres(String s){
        Map<String,Integer> countChar = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            String caracter = String.valueOf(s.charAt(i));
            int atual = countChar.getOrDefault(caracter, 0);
            countChar.put(caracter, atual + 1);
        }
        countChar.forEach((s1, integer) -> System.out.printf("""
                Letra: %s
                Vezes que aparece: %d %n
                """.formatted(s1,integer)));
    }

    public static void printCadaCaractere(String s){
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    public static String printStringAvesso(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void ePalindromo(String s){
        String invertida = printStringAvesso(s);

        if (s.equals(invertida)){
            System.out.printf("""
                    A string "%s" é um palídromo
                    String invertida: %s
                    """.formatted(s,invertida));
        }else System.out.printf("""
                    A string "%s" não é um palídromo
                    String invertida: %s
                    """.formatted(s,invertida));
    }

}
