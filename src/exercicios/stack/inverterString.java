package exercicios.stack;

import java.util.Stack;

public class inverterString {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        String nome = "Hello";

        for(int i = 0; i < nome.length(); i++){
            pilha.add(String.valueOf(nome.charAt(i)));
        }

        // System.out.print(pilha);

        while (!pilha.isEmpty()){
            var a = pilha.pop();
            System.out.print(a);
        }


    }
}
