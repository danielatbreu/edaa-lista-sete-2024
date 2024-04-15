import java.util.Scanner;
import java.util.Stack;

public class ConversaoBaseNumerica {
    public static String converterDecimalParaBinario(int numeroDecimal) {
        Stack<Integer> pilha = new Stack<>();
        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 2;
            pilha.push(resto);
            numeroDecimal /= 2;
        }
        return montarStringBase(pilha);
    }

    public static String converterDecimalParaOctal(int numeroDecimal) {
        Stack<Integer> pilha = new Stack<>();
        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 8;
            pilha.push(resto);
            numeroDecimal /= 8;
        }
        return montarStringBase(pilha);
    }

    public static String converterDecimalParaHexadecimal(int numeroDecimal) {
        Stack<Character> pilha = new Stack<>();
        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 16;
            if (resto < 10) {
                pilha.push((char) (resto + '0')); // Dígito numérico
            } else {
                pilha.push((char) (resto - 10 + 'A')); // Dígito hexadecimal (A-F)
            }
            numeroDecimal /= 16;
        }
        return montarStringBaseHexadecimal(pilha);
    }

    public static String montarStringBase(Stack<?> pilha) {
        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }
        return resultado.toString();
    }

    public static String montarStringBaseHexadecimal(Stack<?> pilha) {
        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número decimal a ser convertido: ");
        int numeroDecimal = scanner.nextInt();

        System.out.println("Escolha a base para conversão:");
        System.out.println("a) Binário");
        System.out.println("b) Octal");
        System.out.println("c) Hexadecimal");
        System.out.print("Opção: ");
        char opcao = scanner.next().charAt(0);

        String resultado;
        switch (opcao) {
            case 'a':
                resultado = converterDecimalParaBinario(numeroDecimal);
                System.out.println("Binário: " + resultado);
                break;
            case 'b':
                resultado = converterDecimalParaOctal(numeroDecimal);
                System.out.println("Octal: " + resultado);
                break;
            case 'c':
                resultado = converterDecimalParaHexadecimal(numeroDecimal);
                System.out.println("Hexadecimal: " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}

