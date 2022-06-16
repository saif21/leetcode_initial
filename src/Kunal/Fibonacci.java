package Kunal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int initial=0;
        int secondary=1;
        int count=2;
        while(count<=x){
            int temp=secondary;
            secondary=secondary+initial;
            initial=temp;
            count++;
        }
        System.out.println(secondary);
    }
}
