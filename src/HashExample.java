import java.util.HashMap;
import java.util.HashSet;

public class HashExample {
    public static void main(String[] args) {


        // HashCode()
        String texto = "Olá mundo!";
        int hash = texto.hashCode();
        System.out.printf("Hash do txt: " + hash + "\n");

        // HashMap()
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Bruno", 10);
        notas.put("Ana", 8);
        notas.put("Carlos", 9);

        /* Buscando um valor pela chave */
        System.out.println("Nota de Bruno: " + notas.get("Bruno"));

        /* Verificando se uma chave existe */
        System.out.println("Carlos está na lista? " + notas.containsKey("Carlos"));
        System.out.println("Carlos está na lista? " + notas.containsKey("Gabrielle"));

        // HashSet()
        HashSet<String> nome = new HashSet<>();

        nome.add("Bruno");
        nome.add("Nilson");
        nome.add("Idalina");
        nome.add("Gabrielle");
        nome.add("Luna");
        nome.add("Bruno");

        System.out.println("Lista de nomes: " + nome);
    }
}
