package SlidingWindow;

public class MaxSum {
    public static void main(String[] args) {
        int[]nums={4,2,1,7,8,1,2,8,1,0};
        int k=3;
        System.out.println(maxSubArray(nums,k));
    }
    static int maxSubArray(int [] nums, int k){
        int maxVal=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(i>=k-1){
                maxVal=Math.max(maxVal, currentSum);
                currentSum -= nums[i-(k-1)];
            }
        }
        return maxVal;
    }
}
