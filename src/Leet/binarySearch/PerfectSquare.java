package Leet.binarySearch;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(new PerfectSquare().isPerfectSquare(num));
    }
    public boolean isPerfectSquare(int num) {
        long left=1;
        long right=num;
        if(num<2) return true;
        while(left<=right){
            long mid = (left+right)/2;
            long square=mid*mid;
            if(square == num){
                return true;
            }
            else if(square > num){
                right=mid-1;
            }
            else{
                left = mid+1;
            }


        }
        return false;
    }
}
