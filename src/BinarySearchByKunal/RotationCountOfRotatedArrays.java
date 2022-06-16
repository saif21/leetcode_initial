package BinarySearchByKunal;

public class RotationCountOfRotatedArrays {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8};
        System.out.println(countRotations(nums));
    }

    static int countRotations(int[] nums) {
        int pivot=findPivot(nums);
//        if(pivot==-1){
//            return 0;
//        }
        return pivot+1;
    }
    static int findPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
}
