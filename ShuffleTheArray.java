import java.util.Arrays;

/*
1470. Shuffle the Array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

public class ShuffleTheArray {
    public static void main(String[] args) {

        // testing our example
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {

        // made a new return array
        int[] returnArr = new int[nums.length];

        // counter to make things a bit easier
        int counter = 0;

        // two pointers one starting from 0 and the other from halfway
        // counter is my index
        for (int i = 0, j = n; i < n && j < nums.length; i++, j++) {

            returnArr[counter] = nums[i];
            counter++;

            returnArr[counter] = nums[j];

            counter++;

        }

        return returnArr;
    }

}
