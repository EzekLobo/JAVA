package exemplo;

import java.util.Scanner;

public class VerificarParidade {

    // Função para verificar se um número é par
    public static boolean verificarParidade(int numero) {
        // Se o resto da divisão por 2 for 0, o número é par
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        // Solicitar ao usuário inserir um número inteiro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        // Verificar a paridade e exibir o resultado
        if (verificarParidade(numero)) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

       
        scanner.close();
    }
}
