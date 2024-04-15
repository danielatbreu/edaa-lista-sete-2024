import java.util.Stack;

public class EstatisticasPilhaNumeros {
    public static void estatisticasPilha(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int tamanho = 0;

        while (!pilha.isEmpty()) {
            int valor = pilha.pop();
            menor = Math.min(menor, valor);
            maior = Math.max(maior, valor);
            soma += valor;
            tamanho++;
        }

        double media = (double) soma / tamanho;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
    }

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(3);
        pilha.push(1);
        pilha.push(4);
        pilha.push(2);
        pilha.push(5);

        estatisticasPilha(pilha);
    }
}

