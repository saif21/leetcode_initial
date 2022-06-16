package LeetcodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy1431 {
    public static void main(String[] args) {
        int []arr={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
        System.out.println(ans(arr,3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>arrBool=new ArrayList<>();
        int max= Arrays.stream(candies).max().getAsInt();
        for(int i:candies){
            if(i+extraCandies>=max){
                arrBool.add(true);
            }else {
                arrBool.add(false);
            }
        }
        return arrBool;
    }
    //another solution linear search.
    static List<Boolean> ans(int[]candies,int extra){
        List<Boolean> arrbool=new ArrayList<>();
        for(int i:candies){
            int res=i+extra;
            arrbool.add(check(candies,res));
        }
        return arrbool;
    }
    static boolean check(int[]candies,int res) {
        for (int i : candies) {
            if (i > res) {
                return false;
            }
        }
        return true;
    }
}
