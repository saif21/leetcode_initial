package LeetcodeEasy;

public class Easy69 {
    public static void main(String[] args) {
        int x=49;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        int ans = 1;
        int start = 1;
        int end = x / 2 + 1;
        if (x == 0) return 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
