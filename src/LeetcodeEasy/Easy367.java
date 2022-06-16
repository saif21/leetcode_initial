package LeetcodeEasy;

public class Easy367 {
    public static void main(String[] args) {
        int n=100;
        System.out.println(isPerfectSquare(n));
    }
    public static boolean isPerfectSquare(int num) {
        int start=0;
        int end=num/2;
        if(num==1){
            return true;
        }
        while(start<=end){
            long mid= (start+end)/2;
            if(mid*mid== num){
                return true;
            }else if(mid*mid <num){
                start=(int)mid+1;
            }else{
                end=(int)mid-1;
            }
        }
        return false;
    }
}
