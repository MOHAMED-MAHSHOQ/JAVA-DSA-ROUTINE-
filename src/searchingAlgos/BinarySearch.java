package searchingAlgos;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,3};
        int target=2;
        Arrays.sort(arr);
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
      return -1;
    }
}
