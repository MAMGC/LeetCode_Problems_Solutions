//Single Element in a Sorted Array
public class Solution {
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }

        int i =0;
        while(i < nums.length-1){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }

            i = i+2;
        }
        return nums[i];
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int result = singleNonDuplicate(arr);
        System.out.println(result);
    }
}
