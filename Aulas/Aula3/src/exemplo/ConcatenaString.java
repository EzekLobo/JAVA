package exemplo;
import java.util.Scanner;

public class ConcatenaString {

    // Função para concatenar duas strings
    public static String concatenarStrings(String str1, String str2) {
        return str1 + str2;
    }

    // Função para solicitar a digitação de uma string
    public static String solicitarString(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    // Função para exibir uma string
    public static void exibirString(String str) {
        System.out.println("A string concatenada é: " + str);
    }

    public static void main(String[] args) {
        // Solicitar a digitação de duas strings
        String string1 = solicitarString("Digite a primeira string:");
        String string2 = solicitarString("Digite a segunda string:");

        // Concatenar as strings
        String stringConcatenada = concatenarStrings(string1, string2);

        // Exibir a string concatenada
        exibirString(stringConcatenada);
    }
}

