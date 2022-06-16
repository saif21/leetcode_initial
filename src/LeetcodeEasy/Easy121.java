package LeetcodeEasy;

import java.util.Scanner;

public class Easy121 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= {7,1,5,3,6,4};
        int res=result(arr);
        System.out.println(res);
    }
    static int result(int [] prices){
        if(prices==null || prices.length<=1){
            return 0;
        }
        int minPrice=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            res=Math.max(res, prices[i]-minPrice);
            minPrice=Math.min(prices[i],minPrice);
        }
        return res;
    }
}
