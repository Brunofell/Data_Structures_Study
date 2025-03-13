package Ex_DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();

        pilha.push("Bruno");
        pilha.push("Ana");
        pilha.push("Carlos");

        System.out.println("Pilha: " + pilha); // [Carlos, Ana, Bruno]

        System.out.println("Topo: " + pilha.peek()); // Carlos
        System.out.println("Removido: " + pilha.pop()); // Carlos
        System.out.println("Pilha após pop: " + pilha); // [Ana, Bruno]
        System.out.println("Tamanho Pilha Deque: " + pilha.size()); // [Ana, Bruno]
        System.out.println("Pilha está vazia? " + pilha.isEmpty()); // [Ana, Bruno]

    }
}
