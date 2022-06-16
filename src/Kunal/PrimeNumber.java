package Kunal;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(prime(x));
    }
    public static boolean prime(int x){
        int s=2;
        while (s*s<=x){
            if (x%s==0){
                return false;
            }else {
                s+=1;
            }
        }
        return true;
    }
}
