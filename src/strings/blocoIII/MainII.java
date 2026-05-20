package strings.blocoIII;

import java.util.List;

public class MainII {
    public static void main(String[] args) {
        String s1 = "  olá mundo  ";
        OperandoStringsII.removeEspacosStringAllUpper(s1);
        System.out.println("=================");

        List<String> sList = List.of(new String[]{"java", "python", "kotlin"});
        OperandoStringsII.concatenaStrings(sList);
        System.out.println("=================");

        String s2 = "Java";
        OperandoStringsII.validaSeComecaETerminaMesmoChar(s2);
        System.out.println("=================");
        String s3 = "eu amo java";
        OperandoStringsII.inverteCadaPalavra(s3);

    }
}
