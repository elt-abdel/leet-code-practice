import java.util.*;

/**
 * 1480. Running Sum of 1d Array
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.
 */
/*
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
public class SumOf1dArray {

    public static void main(String[] args) {
         

        int[] one = {3,1,2,10,1};
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(runningSum(one)));
        

    }

    public static int[] runningSum(int[] nums) {

        // creating return array
        int[] returnArr = new int[nums.length];
        // total
        int total = 0;
        // for loop
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i]; // add total to current
            returnArr[i] = total; 
        }
        return returnArr;
    }

}
