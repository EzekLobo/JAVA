package conversorTemperatura;
import java.util.Scanner;

public class Conversor {
	
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
	        System.out.println("Digite a temperatura:");
	        double temperatura = scanner.nextDouble();

	        System.out.println("Digite a unidade de origem (1 para Celsius ou 2 para Fahrenheit):");
	        int unidadeOrigem = scanner.nextInt();

	        double resultado;

	        if (unidadeOrigem == 1) {
	            resultado = (temperatura * 9/5) + 32;
	            System.out.println("A temperatura em Fahrenheit é: " + resultado);
	        } else if (unidadeOrigem == 2) {
	            resultado = (temperatura - 32) * 5/9;
	            System.out.println("A temperatura em Celsius é: " + resultado);
	        } else {
	            System.out.println("Unidade de origem não reconhecida!");
	        }
	    }
	}


}
