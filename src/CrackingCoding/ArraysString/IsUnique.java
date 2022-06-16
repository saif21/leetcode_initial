package CrackingCoding.ArraysString;

import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println(isUniqueChars(str));
        System.out.println(isUnique(str));
    }

    public static boolean isUniqueChars(String str){
        if(str.length()>128) return false;
        boolean [] char_set= new boolean[128];
        for(int i=0; i<str.length();i++){
            int val= str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val]=true;
        }
        return true;
    }


    public static boolean isUnique(String str){
        int checker=0;
        for(int i=0;i<str.length();i++){
            int val= str.charAt(i)-'a';
            if((checker & (1<<val)) > 0){
                return false;
            }
            checker |=(1<<val);
        }
        return true;
    }
}


















