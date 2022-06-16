package LeetcodeEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Easy13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(solution(s));
    }

    static int solution(String s){
        HashMap<Character, Integer> dict=new HashMap<>();
        dict.put('I',1);
        dict.put('V',5);
        dict.put('X',10);
        dict.put('L',50);
        dict.put('C',100);
        dict.put('D',500);
        dict.put('M',1000);
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(i>0 && dict.get(s.charAt(i))>dict.get(s.charAt(i-1))){
                res+=dict.get(s.charAt(i))- 2*dict.get(s.charAt(i-1));
            }else{
                res+=dict.get(s.charAt(i));
            }
        }
        return res;
    }
}
