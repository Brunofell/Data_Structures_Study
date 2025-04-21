package leet.Two_Pointers;

public class Valid_Palindrome {
    public static void main(String[] args) {

        String s = "a.";
        var result = isPalindrome(s);
        System.out.print(result);
    }

    public static boolean isPalindrome(String s) {
        // s = stringReplaceChart(s);
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String sInverted = "";

        for(int i = s.length() -1; i >= 0; i--){
            sInverted += s.charAt(i);
        }

        if(s.equals(sInverted)){
            return true;
        }else{
            return false;
        }
    }

    public static String stringReplaceChart(String s){
        s = s.replace(" ", "");
        s = s.replace(".", "");
        s = s.replace(",", "");
        s = s.replace(":", "");
        s = s.toLowerCase();
        return s;
    }

}
