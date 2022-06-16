package LeetcodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy1389 {
    public static void main(String[] args) {
        int [] nums={0,1,2,3,4};
        int [] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
//        List<Integer>arr=arrtemp(nums,index);
        System.out.println(arrtemp(nums,index));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int [] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=arr[index[i]];
            arr[index[i]]=nums[i];
            swap(arr, temp, index[i]);
        }
        return arr;
    }

    static void swap(int[]arr,int temp, int i){
        int temp2=0;
        while(i<arr.length-1){
            temp2=arr[i+1];
            arr[i+1]=temp;
            temp=temp2;
            i++;
        }
        return;
    }
    //another solution
    static String arrtemp(int[]nums, int[] index){
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(index[i], nums[i]);
        }
        return Arrays.toString(arr.toArray());
    }

}
