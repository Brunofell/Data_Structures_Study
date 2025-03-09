import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        // Adicionando elementos na pilha
        pilha.push("Bruno");
        pilha.push("Ana");
        pilha.push("Carlos");

        System.out.println("Pilha: " + pilha); // [Bruno, Ana, Carlos]

        // Pegando o topo da pilha sem remover
        System.out.println("Topo: " + pilha.peek()); // Carlos

        // Removendo o último elemento (LIFO)
        System.out.println("Removido: " + pilha.pop()); // Carlos
        System.out.println("Pilha após pop: " + pilha); // [Bruno, Ana]

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilha.isEmpty()); // false
    }
}
