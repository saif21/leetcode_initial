package LeetcodeEasy;


import java.util.LinkedList;
import java.util.List;

public class Easy989 {
    public static void main(String[] args) {
        int [] nums= {9,9,9,9,9,9,9,9,9,9};
        int k=1;
        System.out.println(addToArrayForm(nums, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        final LinkedList<Integer>list=new LinkedList<>();
        int len=num.length-1;
        while(len>=0 || k!=0){
            if(len>=0){
                k+=num[len];
                len--;
            }
            list.addFirst(k%10);
            k/=10;
        }
        return list;
    }
}
