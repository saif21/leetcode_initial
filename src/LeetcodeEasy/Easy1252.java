package LeetcodeEasy;

public class Easy1252 {
    public static void main(String[] args) {
        int m=2,n=3;
        int [][]indices={{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
        System.out.println(anotherSolution(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int counter = 0;
        for(int x=0;x<indices.length;x++){
            int row=indices[x][0];
            int column=indices[x][1];
            //row increment by iterating columns
            for(int i=0;i<n;i++)
                matrix[row][i]+=1;

            //column increment by iterating rows
            for(int i=0;i<m;i++)
                matrix[i][column]+=1;
        }

        for(int x=0; x<m;x++){
            for(int y=0; y<n;y++){
                if(matrix[x][y]%2==1)
                    counter++;
            }
        }
        return counter;
    }
    static int anotherSolution(int m, int n, int[][]indices){
        int []rows=new int[m];
        int []cols=new int[n];
        for(int i=0;i<indices.length;i++){
            rows[indices[i][0]]+=1;
            cols[indices[i][1]]+=1;
        }
        int res=0;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if((rows[r]+cols[c])%2!=0) res++;
            }
        }
        return res;
    }
}
