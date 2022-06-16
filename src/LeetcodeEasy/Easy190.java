package LeetcodeEasy;

import java.util.Scanner;

public class Easy190 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s=decimalToBinary(num);
        System.out.println(s);
        System.out.println(1<<num);
        int n= binaryToDecimal(s);
        System.out.println(n);
    }
    static String decimalToBinary(int num){
//        System.out.println(Integer.toBinaryString(num));
        return Integer.toBinaryString(num);
    }
    static Integer binaryToDecimal(String s){
//        System.out.println(Integer.getInteger(s));
        return Integer.parseInt(s,2);
    }
}
