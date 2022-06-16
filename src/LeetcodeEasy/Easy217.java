package LeetcodeEasy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Easy217 {
    public static void main(String[] args) {
        int nums[]= {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer>sat=new HashSet<>();
//        for (int num: nums
//             ) {
//            if(!sat.add(num)){
//                return true;
//            }
//        }
//        return false;
        HashMap<Integer, Integer>h=new HashMap<>();
        for(int num : nums){
            if(h.get(num)==null){
                h.put(num, 1);
            }else {
                return true;
            }
        }
        return false;
    }
}
