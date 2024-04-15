import java.util.Stack;

public class InverterPalavras {
    public static String inverterPalavras(String texto) {
        String[] palavras = texto.split(" "); 

        StringBuilder textoInvertido = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>(); 

            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);  
            }

            StringBuilder palavraInvertida = new StringBuilder();
            while (!pilha.isEmpty()) {
                palavraInvertida.append(pilha.pop());  

            }

            textoInvertido.append(palavraInvertida).append(" ");  

        }

        return textoInvertido.toString().trim(); 

    }

    public static void main(String[] args) {
        String texto = "ESTE EXERCÍCIO É MUITO FÁCIL.";
        String textoInvertido = inverterPalavras(texto);
        System.out.println(textoInvertido); 

    }
}
