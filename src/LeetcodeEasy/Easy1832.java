package LeetcodeEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Easy1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        int[]arr=new int[26];
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']++;
        }
        for(int x:arr){
            if(x==0){
                return false;
            }
        }
        return true;
    }
}
