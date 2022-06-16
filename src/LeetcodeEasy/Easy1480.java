package LeetcodeEasy;

import java.util.Arrays;

public class Easy1480 {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int []sumofNums=new int[nums.length];
        sumofNums[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sumofNums[i]=sumofNums[i-1]+nums[i];
        }
        return sumofNums;
    }
}
