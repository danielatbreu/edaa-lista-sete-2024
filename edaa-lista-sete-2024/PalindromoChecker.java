import java.util.Stack;

public class PalindromoChecker {
    public static boolean verificarPalindromo(String palavra) {

        Stack<Character> pilha = new Stack<>();


        for (char letra : palavra.toCharArray()) {
            pilha.push(letra);
        }


        StringBuilder palavraReversa = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraReversa.append(pilha.pop());
        }


        return palavra.equals(palavraReversa.toString());
    }

    public static void main(String[] args) {
        String palavra = "radar";
        if (verificarPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}

