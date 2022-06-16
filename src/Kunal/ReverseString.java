package Kunal;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            rev=c+rev; //adding in front of the new string
        }
        System.out.println(rev);

        StringBuilder s1=new StringBuilder();
        s1.append(s);
        System.out.println(s1.reverse());
    }
}
