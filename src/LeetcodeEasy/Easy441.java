package LeetcodeEasy;

public class Easy441 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        if(n <= 1){
            return n;
        }
        if(n <= 3){
            return n == 3?2:1;
        }
        long start = 2;
        long end = n/2;
        while(start <= end){
            long mid = start+(end-start)/2;
            long coinsFilled = mid * (mid+1)/2;
            if(coinsFilled == n){
                return (int) mid;
            }else if(coinsFilled < n){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return (int)end;
    }
}
