package Leet.binarySearch;

public class arrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(6));
    }
    public static int arrangeCoins(int n) {
        //    int row =1;
        //    while(n>=row){
        //     n=n-row;
        //     row++;
        //    }
        //    return row-1;

        long left=1;
        long right=n;
        while(left<=right){
            long mid = left + (right - left) / 2;
            long total = mid * (mid + 1) / 2;
            if(total==n){
                return (int) mid;
            }
            else if(total<n){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return (int) right ;
    }
}
