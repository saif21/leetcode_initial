package SlidingWindow;

public class SmallestSubArray {
    public static void main(String[] args) {
        int []arr={4,2,2,7,8,1,2,8,10};
        int targetSum=10;
        System.out.println(smallestSubarray(targetSum, arr));
    }

    static int smallestSubarray(int targetSum, int []arr){
        int minWindowSize=Integer.MAX_VALUE;
        int currentWindowSum=0;
        int windowStart=0;
        for(int windowend=0; windowend<arr.length;windowend++){
            currentWindowSum+=arr[windowend];
            while(currentWindowSum>=targetSum){
                minWindowSize=Math.min(minWindowSize, windowend-windowStart+1);
                currentWindowSum-=arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }
}
