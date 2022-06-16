package LeetcodeEasy;

public class Easy1295 {
    public static void main(String[] args) {
        int []nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int sum=0;
        for(int i:nums){
            int count=0;
            while(i>0){
                count++;
                i=i/10;
            }
            if(count%2==0){
                sum++;
            }
        }
        return sum;
    }
}
