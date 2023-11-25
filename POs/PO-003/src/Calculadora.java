import java.util.Scanner;

// Exceção personalizada para divisão por zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

// Classe Calculadora que lida com a exceção personalizada
public class Calculadora {

    // Método para adição
    public static int somar(int a, int b) {
        return a + b;
    }

    // Método para subtração
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicação
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para divisão de inteiros com tratamento de exceção
    public static int dividirInteiros(int numerador, int denominador) throws DivisionByZeroException {
        if (denominador == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }

    // Método para divisão de floats com tratamento de exceção
    public static float dividirFloat(float numerador, float denominador) throws DivisionByZeroException {
        if (denominador == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }

    // Método principal para interação com o usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação de números e operação
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        System.out.print("Digite o número da operação desejada: ");
        int escolhaOperacao = scanner.nextInt();

        if (escolhaOperacao == 4) {
            // Se escolher divisão, oferece escolher entre inteiros e floats
            System.out.println("Escolha o tipo de divisão:");
            System.out.println("1. Divisão de inteiros");
            System.out.println("2. Divisão de floats");

            System.out.print("Digite o número da escolha desejada: ");
            int escolhaDivisao = scanner.nextInt();

            try {
                switch (escolhaDivisao) {
                    case 1:
                        System.out.println("Resultado: " + dividirInteiros(numero1, numero2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + dividirFloat(numero1, numero2));
                        break;
                    default:
                        System.out.println("Opção inválida para tipo de divisão.");
                }
            } catch (DivisionByZeroException e) {
                System.out.println("Erro ao dividir: " + e.getMessage());
            }
        } else {
            // Execução da operação escolhida (adição, subtração, multiplicação)
            try {
                switch (escolhaOperacao) {
                    case 1:
                        System.out.println("Resultado: " + somar(numero1, numero2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + subtrair(numero1, numero2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicar(numero1, numero2));
                        break;
                    default:
                        System.out.println("Opção inválida para operação.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro aritmético: " + e.getMessage());
            }
        }
    }
}
