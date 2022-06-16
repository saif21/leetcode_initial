package LeetcodeEasy;

import java.util.Scanner;

public class SubtractTheProduct1281 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1, sum=0;
        while (n>0){
            int rem=n%10;
            mul=rem*mul;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(mul-sum);
    }
}
