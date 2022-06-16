package Kunal;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int oc=sc.nextInt();
        int count=0;
        while (number>0){
            int rem=number%10;
            number=number/10;
            if(rem==oc){
                count++;
            }
        }
        System.out.println(count);
    }
}
