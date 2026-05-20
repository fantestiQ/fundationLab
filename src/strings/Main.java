package strings;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String b = "banana";
        OperandoStrings.printCoutCaracteres(b);
        System.out.println("================");
        OperandoStrings.printCadaCaractere(b);
        System.out.println("================");
        System.out.println(OperandoStrings.printStringAvesso(b));
        System.out.println("================");
        OperandoStrings.ePalindromo(b);
    }
}