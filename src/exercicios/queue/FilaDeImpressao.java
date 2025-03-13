package exercicios.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDeImpressao {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i <= 5; i++){
            System.out.println("Adicione um número a lista: ");
            System.out.print(">> ");
            int num = sc.nextInt();
            fila.add(num);
        }

        System.out.println("Fila: " + fila);

        while (!fila.isEmpty()){
            var a = fila.poll();
            System.out.print(a);
        }
    }
}
