package BinarySearchByKunal;

public class Bsearch1 {
    public static void main(String[] args) {
        int []arr={2,3,7,9,19,78,89,899};
        int []arr2={89,79,67,45,33,22,11,4,3,2,-9,-18};

        int ans=binarySearch(arr,19);

        System.out.println(ans);
        System.out.println(binarySearch(arr2,4));
    }
    //agnostic binary search.
    //array is sorted, but we don't know how i.e. ascending or descending order.
    static int binarySearch(int[]arr, int target){
        int start=0;
        int end=arr.length-1;
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
