package LeetcodeEasy;

public class Easy1539 {
    public static void main(String[] args) {
        int[]arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int n= arr.length;
        int left=0;
        int right=n-1;
//        int missing= compute(arr[n-1], n);
        while (left <= right){
            int mid = left + (right-left)/2;
            int missing = compute(arr[mid], mid+1);
            if(missing >= k) right=mid-1;
            else left=mid+1;
        }
        if(right==-1) return k;
        return arr[right]+k-compute(arr[right], right+1);
    }
    static int compute(int actual, int expected){
        return actual-expected;
    }
}
