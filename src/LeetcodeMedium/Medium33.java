package LeetcodeMedium;


//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Medium33 {
    public static void main(String[] args) {
        int []nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int pivot=findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,end);
        }
        //if pivot is found, 2 asc search
        if(nums[pivot]==target){
            return pivot;
        }if(target>=nums[start]){
            return binarySearch(nums,target,start,pivot-1);
        }else{
            return binarySearch(nums,target, pivot+1,end);
        }
    }

    static int binarySearch(int []nums,int target, int start, int end){
        while (start<=end){
            int mid=start + (end - start) / 2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int []arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int []arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid]== arr[start] && arr[mid]==arr[end]){
                //skip duplicates
                //Note: what if these elements at start end were pivot?
                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot;
                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot should be in right.
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else {
                end=end-1;
            }
        }
        return -1;
    }
}
