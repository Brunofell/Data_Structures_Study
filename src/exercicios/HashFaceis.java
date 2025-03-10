package exercicios;

import java.util.ArrayList;
import java.util.HashMap;

public class HashFaceis {

    public static void main(String[] args) {

        System.out.println("Substituir o valor de uma chave no HashMap");
        HashMap<String, Integer> listaHash = new HashMap<>();

        listaHash.put("a", 5);
        listaHash.put("b", 10);
        listaHash.put("c", 3);
        System.out.println(listaHash);
        listaHash.put("b", 20);
        System.out.println(listaHash);

        System.out.println("Remover um item do HashMap pelo nome da chave");
        System.out.println(listaHash);
        listaHash.remove("b");
        System.out.println(listaHash);
        listaHash.put("b", 10);

        System.out.println("Verificar se uma chave existe no HashMap");
        System.out.println(listaHash);
        System.out.println("b está na lista? " + listaHash.containsKey("b"));
        System.out.println("10 está na lista? " + listaHash.containsValue(10));

        System.out.println("Concatenar todas as chaves em um HashMap");
        StringBuilder resultado = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();
        for(String key: listaHash.keySet()){
            resultado.append(key);
            result.add(key);
        }
        System.out.println(result);
        System.out.println(resultado);
    }



}
