package Kunal;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int []arr={234,453,244,56,28,2288,280,28213};
        System.out.println(countOfNums(arr));
        System.out.println(digitsCount(-393292));
    }
    static int countOfNums(int []arr){
        int count=0;
        for(int num: arr){
            if(digitsNo(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        String s= Integer.toString(num);
        String j=""+num;
        if(j.length()%2==0){
            return true;
        }
        return false;
    }

    static boolean digitsNo(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count%2==0;
    }
    static int digitsCount(int num){
        if(num<0){
            num=num*-1;
        }
        return (int) (Math.log10(num))+1;
    }
}
