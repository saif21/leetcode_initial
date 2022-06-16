package LeetcodeEasy;

import java.util.Arrays;

public class Easy1470 {
    public static void main(String[] args) {
        int [] arr={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int []arr=new int[n*2];
        for(int i=0;i<n;i++){
            arr[i*2]=nums[i];
            arr[i*2+1]=nums[n+i];
        }
        return arr;
    }

}
