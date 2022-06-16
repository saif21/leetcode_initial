package LeetcodeEasy;

public class Easy1572 {
    public static void main(String[] args) {
        int [][]mat={
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int ans=0;
        boolean odd=mat.length%2==1;
        int end=mat.length-1;
        if(odd){
            int mid=mat.length/2;
//            int end=mat.length-1;
            for(int i=0;i<mat.length;i++){
                if(i!=mid){
                    ans+=mat[i][end-i];
                }
                ans+=mat[i][i];
            }
        }else {
            for(int i=0;i<mat.length;i++){
                ans+=mat[i][end-i];
                ans+=mat[i][i];
            }
        }
        return ans;
    }
}
