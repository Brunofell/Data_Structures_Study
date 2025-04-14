package leet.Array_String.easy;

import java.util.Arrays;

public class Merge_Sorted_Array {

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int m = 0;

        int[] nums2 = new int[]{1};
        int n = 1;

        merge(nums1, nums2, m, n);


    }

    public static void merge(int[] nums1, int[] nums2, int m, int n){
        nums2 = validateArray(nums2, n);

        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static int[] validateArray(int[] array, int elementNumber){
        int[] tempArray = new int[elementNumber];
        for(int i = 0; i < elementNumber; i++){
            tempArray[i] = array[i];
        }
        return tempArray;
    }

}
