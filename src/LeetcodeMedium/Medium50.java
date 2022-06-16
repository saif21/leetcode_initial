package LeetcodeMedium;

public class Medium50 {
    public static void main(String[] args) {
        double x= 2.00000;
        int n=10;
        System.out.println(myPow(x, n));
    }
    public static double myPow(double x, int n) {
        boolean isPos= n>0;
        int count=0;
        int temp=n;
        if(!isPos){
            temp=n*-1;
        }

        return x;
    }
}
