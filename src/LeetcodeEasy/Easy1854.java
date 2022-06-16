package LeetcodeEasy;
//https://leetcode.com/problems/maximum-population-year/
//line sweep algorithm
public class Easy1854 {
    public static void main(String[] args) {
        int [][]logs={{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs));
        System.out.println(maxPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int []arr=new int [2051];
        for(int[]el:logs){
            arr[el[0]]++;
            arr[el[1]]--;
        }
        for(int i=1950;i<2051;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        int maxPop=0;
        int maxYear=1950;
        for(int i =1950;i<2051;i++) {
            if(maxPop < arr[i]) {
                maxPop = arr[i];
                maxYear = i;
            }
        }
        return maxYear;
    }

    static int maxPopulation(int[][]logs){
        int []arr=new int[101];
        for(int []i:logs){
            arr[i[0]-1950]++;
            arr[i[1]-1950]--;
        }
        for(int i=1;i<101;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        int max=0;
        int maxpop=arr[0];
        for(int i=1; i<101;i++){
            if(arr[i]>maxpop){
                maxpop=arr[i];
                max=i;
            }
        }
        return 1950+max;
    }
}
//need discussions





















