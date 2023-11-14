import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        ArrayList<Float> numeros = new ArrayList<Float>();
        Scanner scanner = new Scanner(System.in);
        float numero;
        float soma = 0;
        int contador = 0;
        System.out.println("Insira uma série de números (insira um número negativo para parar):");
        while (true) {
            numero = scanner.nextFloat();
            if (numero < 0) {
                break;
            }
            numeros.add(numero);
            soma += numero;
            contador++;
        }
        scanner.close();
        float media = soma / contador;
        System.out.println("A média dos números positivos inseridos é: " + media);
    }
}
