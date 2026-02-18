package arrayProblems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting012Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,1,0,1,1,2,0,1,2,1,0,2};
//        bruteForce(arr);
//        betterapp(arr);
        optimalism(arr);
        System.out.println(Arrays.toString(arr));
    }
    //dutch national flag algo TC O(n) SC O(1)
    private static void optimalism(int[] arr) {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }



    private static void betterapp(int[] arr) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else count2++;
        }
        int i=0;
        while(count0-- >0) {
            arr[i++] = 0;
        }
        while(count1-- >0) {
            arr[i++] = 1;
        }
        while(count2-- >0) {
            arr[i++] = 2;
        }


    }

    private static void bruteForce (int[] arr) {
        mergeSorting(arr,0,arr.length-1);
    }

    private static void mergeSorting(int[] arr, int low, int high) {
        if(low==high) return;
        if(low<high){
            int mid = (low+high)/2;
            mergeSorting(arr,low,mid);
            mergeSorting(arr,mid+1,high);
            sortings(arr,low,mid,high);
        }
    }

    private static void sortings(int[] arr, int low, int mid, int high) {
        int left=low;
        int right=mid+1;
        List<Integer> list = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]>arr[right]){
                list.add(arr[right++]);
            }
            else {
                list.add(arr[left++]);
            }
        }
        while(left<=mid){
            list.add(arr[left++]);
        }
        while(right<=high){
            list.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            {
                arr[i]=list.get(i-low);
            }
        }
    }


    // method 2

}
