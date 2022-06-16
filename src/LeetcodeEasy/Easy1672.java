package LeetcodeEasy;

public class Easy1672 {
    public static void main(String[] args) {
        int[][]accounts={
                {11,2,5},
                {2,3,5},
                {1,2,3}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(ans<sum){
                ans=sum;
            }
        }
        return ans;
    }
}
