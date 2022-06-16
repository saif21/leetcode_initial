package Kunal;

import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isNeg=false;
        if(num<0){
            isNeg=true;
            num=num*-1;
        }
        int reverse=0;
        while (num>0){

            int rem = num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(isNeg){
            System.out.println(reverse*-1);
        }else{
            System.out.println(reverse);
        }
    }
}
