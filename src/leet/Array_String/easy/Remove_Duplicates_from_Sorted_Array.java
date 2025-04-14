package leet.Array_String.easy;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}