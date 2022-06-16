package Kunal;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(armstrong(x));
    }
    static boolean armstrong(int x){
        int temp=0, rem=0;
        int t=x;
        while(x>0){
            rem=x%10;
            temp+=Math.pow(rem,3);
            x=x/10;
        }
        return temp==t;
    }
}
