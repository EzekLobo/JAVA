package exemplo;

import java.util.Scanner;
public class CalculoMedia {
	
	    public static float calcularMediaPonderada(float nota1, float peso1, float nota2, float peso2, float nota3, float peso3) {
	        float somaNotas = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
	        float somaPesos = peso1 + peso2 + peso3;
	        return somaNotas / somaPesos;
	    }

	    public static void main(String[] args) {
	        // Solicitar dados ao usuário
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Informe a nota 1: ");
	        float nota1 = scanner.nextFloat();
	        System.out.println("Informe o peso da nota 1: ");
	        float peso1 = scanner.nextFloat();

	        System.out.println("Informe a nota 2: ");
	        float nota2 = scanner.nextFloat();
	        System.out.println("Informe o peso da nota 2: ");
	        float peso2 = scanner.nextFloat();

	        System.out.println("Informe a nota 3: ");
	        float nota3 = scanner.nextFloat();
	        System.out.println("Informe o peso da nota 3: ");
	        float peso3 = scanner.nextFloat();

	        // Calcular e exibir a média ponderada
	        float mediaPonderada = calcularMediaPonderada(nota1, peso1, nota2, peso2, nota3, peso3);
	        System.out.println("A média ponderada é: " + mediaPonderada);

	        // Fechar o scanner
	        scanner.close();
	    }
	


}
