import java.lang.reflect.Array;
import java.util.Arrays;

//Tow Sum problem
public class two_Sum {
    //Time complexity: o(n*log(n))
    private static int[] findTowSum_Sorting(int[] nums , int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            if(nums[left] + nums[right] == target){
                return new int[] {nums[left] + nums[right]};
            }
            else if (nums[left] + nums[right] < target){
                left++;
            }
            else
            {
                right--;
            }
        }
        return new int[]{};
    }
}
