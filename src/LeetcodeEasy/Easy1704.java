package LeetcodeEasy;

import java.util.Arrays;
import java.util.Scanner;

public class Easy1704 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        int a=0;
        String check="aeiouAEIOU";
        String first=s.substring(0,s.length()/2);
        String sec=s.substring(s.length()/2,s.length());
        for(int i=0;i<sec.length();i++){
            if(check.contains(String.valueOf(first.charAt(i)))) a++;
            if(check.contains(String.valueOf(sec.charAt(i)))) a--;
        }
        return a==0;
    }
}
