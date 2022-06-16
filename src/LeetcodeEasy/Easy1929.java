package LeetcodeEasy;

import java.util.Arrays;

public class Easy1929 {
    public static void main(String[] args) {
        int []nums={1,2,1};
        int[]newNums=getConcatenation(nums);
        System.out.println(Arrays.toString(newNums));
    }
    public static int[] getConcatenation(int[] nums) {
        int [] newNums=new int[nums.length*2];

        for(int i=0;i<newNums.length;i++){
            if(i>nums.length-1) {
                newNums[i] = nums[i - nums.length];
            }else {
                newNums[i]=nums[i];
            }
        }
        return newNums;
    }
}
