import java.util.Stack;

public class OrdenarPilhaNumeros {
    public static Stack<Integer> ordenarPilha(Stack<Integer> pilha) {

        Stack<Integer> pilhaOrdenada = new Stack<>();


        while (!pilha.isEmpty()) {

            int valor = pilha.pop();

            while (!pilhaOrdenada.isEmpty() && pilhaOrdenada.peek() > valor) {
                pilha.push(pilhaOrdenada.pop());
            }

            pilhaOrdenada.push(valor);
        }


        return pilhaOrdenada;
    }

    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();
        pilha.push(3);
        pilha.push(1);
        pilha.push(4);
        pilha.push(2);
        pilha.push(5);


        Stack<Integer> pilhaOrdenada = ordenarPilha(pilha);


        System.out.println("Valores ordenados:");
        while (!pilhaOrdenada.isEmpty()) {
            System.out.println(pilhaOrdenada.pop());
        }
    }
}

