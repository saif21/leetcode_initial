package LeetcodeEasy;

public class Easy258 {
    public static void main(String[] args) {
        int num=199;
        System.out.println(addDigits(num));
        System.out.println(easySoln(num));
    }
    public static int addDigits(int num) {
        if(num<10){
            return num;
        }
        int sum=tempSum(num);
        while(sum>9){
            sum=tempSum(sum);
        }
        return sum;
    }
    static int tempSum(int num){
        int temp=num;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=rem;
            temp=temp/10;
        }
        return sum;
    }


    static int easySoln(int num){
        while(num>9){
            num=num%10+num/10;
        }
        return num;

//        return num<10?num:addDigits(num%10 + addDigits(num/10));
    }
}
