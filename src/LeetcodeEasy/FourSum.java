package LeetcodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int target=sc.nextInt();
        int size=sc.nextInt();
        int [] nums= new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        StringBuffer s= new StringBuffer();

        System.out.println(s.append(fourSum(nums,target).toArray()));

    }
    public static List<List<Integer>> fourSum(int[] nums, int target)
    {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++)
        {
            // Its too small than the target
            // Type cast the integer value to prevent overflow

            if((long)nums[i]+(3*(long)nums[nums.length-1])<target)
                continue;

            for(int j=i+1;j<nums.length-2;j++)
            {
                // Its too small than the target

                if((long)nums[i]+(long)nums[j]+(2*(long)nums[nums.length-1])<target)
                    continue;

                int t=target-(nums[i]+nums[j]);

                int l=j+1,h=nums.length-1;
                while(l<h)
                {
                    if(nums[l]+nums[h]==t)
                    {
                        ans.add(Arrays.asList(nums[i],nums[j],nums[l],nums[h]));
                        while(l<h && nums[l]==nums[l+1]) l++;
                        while(l<h && nums[h-1]==nums[h]) h--;
                        l++;
                        h--;
                    }
                    else if(nums[l]+nums[h]<t)
                        l++;
                    else
                        h--;
                }
                while(j+1<nums.length-1 && nums[j]==nums[j+1]) ++j;
            }
            while(i+1<nums.length-2 && nums[i]==nums[i+1]) ++i;
        }
        return ans;
    }
}
