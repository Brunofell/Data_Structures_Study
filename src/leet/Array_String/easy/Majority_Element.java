package leet.Array_String.easy;

public class Majority_Element {
    public static void main(String[] args) {

        int[] nums = {3, 2, 3};
        int[] nums2 = {3, 3, 4};
        int[] nums3 = {2, 2, 1, 1, 1, 2, 2};
        int[] nums4 = {1};
        int[] nums5 = {1, 1, 1, 2, 3};
        int[] nums6 = {5, 5, 5, 5, 5, 1, 2, 3, 4};
        int[] nums7 = {0, 0, 0, 1};
        int[] nums8 = {7, 7, 7, 7, 7, 8, 9};
        int[] nums9 = {6, 5, 5};
        int[] nums10 = {1000000000, 1000000000, 1};
        int[] nums11 = {9, 9, 8, 9, 7, 9, 9};
        int[] nums12 = {4, 4, 4, 4, 2, 2, 2};
        int[] nums13 = {2, 2, 2, 2, 2, 2, 1};

//        System.out.println(majorityElement(nums));    // 3
//        System.out.println(majorityElement(nums2));   // 3
//        System.out.println(majorityElement(nums3));   // 2
//        System.out.println(majorityElement(nums4));   // 1
//        System.out.println(majorityElement(nums5));   // 1
//        System.out.println(majorityElement(nums6));   // 5
//        System.out.println(majorityElement(nums7));   // 0
//        System.out.println(majorityElement(nums8));   // 7
//        System.out.println(majorityElement(nums9));   // 5
//        System.out.println(majorityElement(nums10));  // 1000000000
//        System.out.println(majorityElement(nums11));  // 9
//        System.out.println(majorityElement(nums12));  // 4
//        System.out.println(majorityElement(nums13));  // 2
        majorityElementEfficient(nums13);
    }


    public static int majorityElement(int[] nums) { // ta correto mas está operando em nível O(n²)

        int currentNum = 0;
        int currentApparition = 0;
        int biggestOccurrenceNum = 0;
        int biggestOccurrence = 0;

        for(int i = 0; i < nums.length; i++){
            currentNum = nums[i];
            for(int num : nums){
                if(currentNum == num){
                    currentApparition++;
                }
            }
            if(currentApparition > biggestOccurrence){
                biggestOccurrence = currentApparition;
                biggestOccurrenceNum = currentNum;
            }
            currentApparition = 0;
        }

        return biggestOccurrenceNum;
    }

    // Código baseado em Moore’s Voting Algorithm

    public static int majorityElementEfficient(int[] nums) { // ta correto mas está operando em nível O(n²)

        int candidate = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
                count = 1;
            }else if(nums[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}

















