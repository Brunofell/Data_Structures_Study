import java.util.Arrays;

public class VerifyAnagrams {
    public static void main(String[] args) {
        String s1 = "Red Rum";
        String s2 = "Murder";

        System.out.println(isAnagramValid(s1, s2));


    }

    public static boolean isAnagramValid(String s1, String s2){

        if (s1 == null || s2 == null || s1.isBlank() || s2.isBlank()) {
            return false;
        }

        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();


        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(array1.length != array2.length){
            return false;
        }

        return Arrays.equals(array1, array2); // true or false

    }

}
