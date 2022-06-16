package LeetcodeEasy;

public class Easy231 {
    public static void main(String[] args) {
        int n=1;
        System.out.println(isPowerOfTwo(n));
        System.out.println(anotherSolution(16));
    }
    public static boolean isPowerOfTwo(int n) {
        int start=0;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Math.pow(2,mid)==n){
                return true;
            }else if(Math.pow(2,mid)>n){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return false;
    }
    public static boolean anotherSolution(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
