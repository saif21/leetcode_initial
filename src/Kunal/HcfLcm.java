package Kunal;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int numerator, denominator, rem,gcd,lcm;
        if(x>y){
            numerator=x;
            denominator=y;
        }else {
            numerator=y;
            denominator=x;
        }
        rem=numerator%denominator;
        while(rem!=0){
            numerator=denominator;
            denominator=rem;
            rem=numerator%denominator;
        }
        gcd=denominator;
        lcm=x*y/gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
