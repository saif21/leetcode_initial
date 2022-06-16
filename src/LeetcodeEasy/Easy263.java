package LeetcodeEasy;

public class Easy263 {
    public static void main(String[] args) {
        int num=14;
        System.out.println(isUgly(num));
    }

    public static boolean isUgly(int n) {
        while(n>1){
            if(n%2==0){
                n/=2;
            }else if(n%3==0){
                n/=3;
            }else if(n%5==0){
                n/=5;
            }else{
                return false;
            }
        }
        return (n==1);
    }
}
