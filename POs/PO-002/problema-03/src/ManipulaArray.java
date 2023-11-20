import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {

    public static int[] criarArrayDoUsuario() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do array: ");
            int tamanho = scanner.nextInt();

            int[] array = new int[tamanho];

            System.out.println("Digite os elementos do array:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            return array;
        }
    }

    public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Números aleatórios entre 0 e 99
        }

        return array;
    }

    public static int[] somarArrays(int[] array1, int[] array2) {
        int tamanho = Math.min(array1.length, array2.length);
        int[] resultado = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            resultado[i] = array1[i] + array2[i];
        }

        return resultado;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[] arrayUsuario = criarArrayDoUsuario();
        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));

        int[] arrayAleatorio = criarArrayAleatorio(arrayUsuario.length);
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));

        int[] arraySoma = somarArrays(arrayUsuario, arrayAleatorio);
        System.out.println("Array resultante da soma: " + Arrays.toString(arraySoma));

        int soma = calcularSoma(arraySoma);
        System.out.println("Soma do array resultante: " + soma);

        int maiorValor = encontrarMaiorValor(arraySoma);
        System.out.println("Maior valor do array resultante: " + maiorValor);

        int menorValor = encontrarMenorValor(arraySoma);
        System.out.println("Menor valor do array resultante: " + menorValor);
    }
}
