package calculadoraSimples;
import java.util.Scanner;

public class Calculadora {

	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Digite o primeiro número:");
				double num1 = scanner.nextDouble();

				System.out.println("Digite o segundo número:");
				double num2 = scanner.nextDouble();

				System.out.println("Escolha a operação (+, -, *, /):");
				String operacao = scanner.next();

				double resultado;

				switch (operacao) {
				    case "+":
				        resultado = num1 + num2;
				        break;
				    case "-":
				        resultado = num1 - num2;
				        break;
				    case "*":
				        resultado = num1 * num2;
				        break;
				    case "/":
				        if (num2 != 0) {
				            resultado = num1 / num2;
				        } else {
				            System.out.println("Erro! Divisão por zero não é permitida.");
				            return;
				        }
				        break;
				    default:
				        System.out.println("Operação não reconhecida!");
				        return;
				}

				System.out.println("O resultado é: " + resultado);
			}
	  }
}
