package leet.Array_String.easy;

import java.util.Arrays;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println(result);
    }


    public static int romanToInt(String s) {
        int[] numArray = arrayRomanToInt(s);
        int cont = 0;
        for(int i = 0; i < numArray.length; i++){
            if(i < numArray.length -1 && numArray[i] < numArray[i+1]){
                cont-=numArray[i];
            }else{
                if(numArray[i] == 1){
                    cont+=1;
                }
                if(numArray[i] == 5){
                    cont+=5;
                }
                if(numArray[i] == 10){
                    cont+=10;
                }
                if(numArray[i] == 50){
                    cont+=50;
                }
                if(numArray[i] == 100){
                    cont+=100;
                }
                if(numArray[i] == 500){
                    cont+=500;
                }
                if(numArray[i] == 1000){
                    cont+=1000;
                }
            }
        }
        return cont;
    }

    public static int[] arrayRomanToInt(String s) {
        char[] chartArray = s.toCharArray();
        int[] valores = new int[chartArray.length];
        for (int i = 0; i < chartArray.length; i++) {
            if (chartArray[i] == 'I') {
                valores[i] = 1;
            }
            if (chartArray[i] == 'V') {
                valores[i] = 5;
            }
            if (chartArray[i] == 'X') {
                valores[i] = 10;
            }
            if (chartArray[i] == 'L') {
                valores[i] = 50;
            }
            if (chartArray[i] == 'C') {
                valores[i] = 100;
            }
            if (chartArray[i] == 'D') {
                valores[i] = 500;
            }
            if (chartArray[i] == 'M') {
                valores[i] = 1000;
            }
        }
        return valores;
    }
}
