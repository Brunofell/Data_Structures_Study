package leet.hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("Onurb", "Bruno"));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        HashSet<String> hashRanson = new HashSet<>();
        HashSet<String> hashMagazine = new HashSet<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            hashRanson.add(String.valueOf(ransomNote.toLowerCase().charAt(i)));
        }
        for (int i = 0; i < magazine.length(); i++) {
            hashMagazine.add(String.valueOf(magazine.toLowerCase().charAt(i)));
        }

        return hashMagazine.containsAll(hashRanson);
    }
}