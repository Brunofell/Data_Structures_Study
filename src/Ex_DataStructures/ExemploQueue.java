package Ex_DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
         Queue<String> fila = new LinkedList<>();

        // Adicionando elementos à fila
        fila.add("Bruno");
        fila.add("Ana");
        fila.add("Carlos");

        System.out.println("Fila: " + fila); // [Bruno, Ana, Carlos]

        // Pegando o primeiro da fila sem remover
        System.out.println("Primeiro da fila: " + fila.peek()); // Bruno

        // Removendo o primeiro da fila (FIFO)
        System.out.println("Removido: " + fila.poll()); // Bruno
        System.out.println("Fila após poll: " + fila); // [Ana, Carlos]

        // Verificando se a fila está vazia
        System.out.println("A fila está vazia? " + fila.isEmpty()); // false
    }
}
