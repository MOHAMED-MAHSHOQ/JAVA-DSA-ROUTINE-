package arrayProblemsEasy;
import  static arrayProblemsEasy.LeftRotateByD.reverse;
public class RightShiftByD {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d=2;
        new RightShiftByD().rightShiftByD(arr,d);
        System.out.println(java.util.Arrays.toString(arr));
    }
    public void rightShiftByD(int[] arr , int d){
        d=d%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
    }
}
