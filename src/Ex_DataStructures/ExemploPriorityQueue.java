package Ex_DataStructures;

import java.util.PriorityQueue;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> fila = new PriorityQueue<>();

        fila.add(5);
        fila.add(1);
        fila.add(3);

        System.out.println("Fila: " + fila); // A ordem interna pode ser diferente
        System.out.println("Menor elemento: " + fila.poll()); // Sempre remove o menor número primeiro
    }
}
