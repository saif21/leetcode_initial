package LeetcodeEasy;

import java.util.Arrays;

public class Easy867 {
    public static void main(String[] args) {
        int [][]arr= {
                {1,2,3},
                {4,5,6}
//                {7,8,9}
        };
        for(int[]i:transpose(arr)){
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int [][] tm = new int [col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tm[j][i] = matrix[i][j];
            }
        }

        return tm;
    }
}
