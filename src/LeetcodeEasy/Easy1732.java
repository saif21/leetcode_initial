package LeetcodeEasy;

public class Easy1732 {
    public static void main(String[] args) {
        int []gain={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {

        int []arr=new int[gain.length+1];
        arr[0]=0;
        int max=arr[0];
        for(int i=0;i<gain.length;i++){
            arr[i+1]=arr[i]+gain[i];
            if(max<arr[i+1]){
                max=arr[i+1];
            }
        }
        return max;
    }
}
