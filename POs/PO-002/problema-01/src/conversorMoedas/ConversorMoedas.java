package conversorMoedas;
import java.util.Scanner;
public class ConversorMoedas {
	  public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite a taxa de câmbio: ");
	        double taxaCambio = scanner.nextDouble();

	        
	        System.out.print("Digite a quantidade em dólares: ");
	        double quantidadeDolares = scanner.nextDouble();

	        
	        double valorConvertido = quantidadeDolares * taxaCambio;

	       
	        System.out.println("O valor convertido é: " + valorConvertido);

	        
	        scanner.close();
	    }
}
