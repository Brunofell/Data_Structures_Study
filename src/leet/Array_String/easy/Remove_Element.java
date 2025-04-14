package leet.Array_String.easy;

import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        int val = 3;

        removeElement(nums, val);

    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("val: " + val);
        System.out.println("k: " + k);
        return k;
    }
}


/*
*
* pegar lista nums e val
* remover todas as ocorrencias de val em num
*
*
*
*
*
*
*
*
*
*
*
* */