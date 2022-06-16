package LeetcodeEasy;

public class Easy374 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(guess(10));
    }
    static int guess(int num){
        int target=6;
        if(num== target){
            return 0;
        }else if(num>target){
            return -1;
        }else {
            return 1;
        }
    }
    public static int guessNumber(int n) {
        int start=0;
        int end=n;
        while(true){
            int mid= start+(end-start)/2;
            int nx = guess(mid);
            if(nx==0){
                return mid;
            }else if(nx==-1){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
    }
}
