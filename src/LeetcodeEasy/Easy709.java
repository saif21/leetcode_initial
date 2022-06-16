package LeetcodeEasy;

import java.util.Locale;
import java.util.Scanner;

public class Easy709 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
//        System.out.println(s.toLowerCase());
        System.out.println(solution(s));
    }

    static String solution(String s){
        char []y=s.toCharArray();
        for(int i=0;i<y.length;i++){
            if(y[i]>='A' && y[i]<='Z'){
                y[i]= (char)(y[i]+32);
            }
        }
        return new String(y);
    }
}
