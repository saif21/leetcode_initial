package LeetcodeEasy;

public class Easy747 {
    public static void main(String[] args) {
        int nums[]={0,2,1,3};
        System.out.println(dominantIndex(nums));
    }
    static int dominantIndex(int[] nums) {
        int max=-1;
        int secMax=-1;
        int maxId=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
                maxId=i;
            }else if(nums[i]>secMax){
                secMax = nums[i];
            }
        }
        return secMax*2 <= max ? maxId:-1;
    }
}
