package CrackingCoding.ArraysString;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(permutation(s,t));

    }

    public static String sort(String s){
        char [] content= s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
