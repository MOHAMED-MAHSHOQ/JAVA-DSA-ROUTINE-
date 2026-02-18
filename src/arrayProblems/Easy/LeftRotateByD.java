package arrayProblems.Easy;
import java.util.ArrayList;
import java.util.List;

//or you can import java.util.Arrays; and use Arrays.toString(arr) to print the array instead of for loop
//or you can use Integer.reverse() method to reverse the array instead of writing your own reverse method

public class LeftRotateByD {
    public static void main(String[] args) {
        int[] arr = {4,3,4,5,9};
//        new LeftRotateByD().rotateArrayByD(arr,3);
//        new LeftRotateByD().bruteForce(arr,3);
          new LeftRotateByD().optimalSolution(arr,3);
         for(int i : arr){
             System.out.print(i+" " );
         }

    }
    //TC O(n*d) SC O(1) and for algo TC O(n) SC O(n)
    public void rotateArrayByD(int[] arr, int d) {
        int k = d%arr.length;
        for(int i=0;i<k;i++){
            int temp = arr[0];
            int j=1;
            while(j<arr.length){
                arr[j-1]=arr[j];
                j++;
            }
            arr[arr.length-1]=temp;
        }
    }

    //TC O(n) SC O(d) and for algo TC O(n) SC O(n)
    public void bruteForce(int[] arr,int d){
        d = d % arr.length;
        int n=arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<d;i++){
            list.add(arr[i]);
        }

        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }

        for(int i=n-d;i<n;i++){
            arr[i] = list.get(i-(n-d));
        }


    }

    //TC O(n) SC O(1) and for algo TC O(n) SC O(n)
    public void optimalSolution(int[] arr,int d){
        d = d % arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    public static void reverse(int[] arr, int start,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

    }
    }


}

