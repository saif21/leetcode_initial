package LeetcodeEasy;

public class Easy35 {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(arr, target));
    }
    public static int searchInsert(int[] arr, int target) {

        int start=0;
        int end=arr.length-1;
        // if(arr[end]<target) return arr.length;
        // if(arr[start]>target){
        //     return 0;
        // }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
