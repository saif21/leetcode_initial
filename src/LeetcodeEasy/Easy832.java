package LeetcodeEasy;

import java.util.Arrays;

public class Easy832 {
    public static void main(String[] args) {
        int [][]arr={{1,1,0},{1,0,1},{0,0,0}};
//        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
        int [][]res=flipAndInvertImage(arr);
        for(int []i:res){
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int arr[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][image[i].length-j-1]==0){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}
