package BinarySearchByKunal;

public class TargetInInfiniteArray {
    public static void main(String[] args) {
        int []arr={3,5,7,9,10,90,100,130, 140, 160, 170};
        int target=90;
        System.out.println(ans(arr,target));
    }
    static int ans(int[]arr,int target){
        //first find the range;
        //first create the chunk of two elements.
        int start=0;
        int end=1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            int newstart =end+1;
            //double the chunk
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return position(arr, target,start, end);
    }


    static int position(int []arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
