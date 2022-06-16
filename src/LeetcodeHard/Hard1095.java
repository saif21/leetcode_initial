package LeetcodeHard;

public class Hard1095 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,1};
        System.out.println(search(arr, 3));
    }
    public static int search(int[]arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=position(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return position(arr, target, peak+1, arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    static int position(int []arr, int target, int start, int end){
        boolean isAsc = arr[end] > arr[start]; //to check if the array is in ascending or descending order.

        while (start <= end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
