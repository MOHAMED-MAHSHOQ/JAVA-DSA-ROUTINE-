package arrayProblems.Easy;

import java.util.Arrays;

//TC O(n) SC O(1) and for algo TC O(n) SC O(n)

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        new LeftRotateByOne().rotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void rotateArrayByOne(int[] arr) {
        int temp=arr[0];
        int i=1;
        while(i<arr.length){
            arr[i-1] = arr[i];
            i++;
        }
        arr[arr.length-1]=temp;
    }
}
