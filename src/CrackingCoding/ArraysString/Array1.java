package CrackingCoding.ArraysString;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] words=new String[5];
        for(int i=0;i< words.length;i++){
            words[i]=sc.next();
        }
        String [] more=new String[5];
        for(int i=0;i< more.length;i++){
            more[i]=sc.next();
        }
        System.out.println(merge(words,more));
        System.out.println(joinwords(words));

    }

    public static ArrayList<String> merge(String[] words, String[]more){
        ArrayList<String> sentance= new ArrayList<String>();
        for(String w: words)sentance.add(w);
        for(String w: more) sentance.add(w);
        return sentance;
    }
    public static String joinwords(String[] words){
        StringBuilder sentance= new StringBuilder();
        for (String w: words){
            sentance.append(w+" ");
        }
        return sentance.toString();
    }
}
