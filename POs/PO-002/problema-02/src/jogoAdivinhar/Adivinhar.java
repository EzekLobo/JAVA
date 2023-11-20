package jogoAdivinhar;
import java.util.Random;
import java.util.Scanner;

public class Adivinhar {
	 public static void main(String[] args) {
	        
	        Random random = new Random();

	        int numeroAleatorio = random.nextInt(100) + 1;

	        Scanner scanner = new Scanner(System.in);

	        int tentativa;

	        do {
	            
	            System.out.print("Tente adivinhar o número (entre 1 e 100): ");
	            tentativa = scanner.nextInt();

	           
	            if (tentativa > numeroAleatorio) {
	                System.out.println("Muito alto! Tente novamente.");
	            } else if (tentativa < numeroAleatorio) {
	                System.out.println("Muito baixo! Tente novamente.");
	            } else {
	                System.out.println("Parabéns! Você adivinhou o número corretamente.");
	            }
	        } while (tentativa != numeroAleatorio);

	        scanner.close();
	    }

}
