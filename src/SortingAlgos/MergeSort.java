package SortingAlgos;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,4,5,3,9,6,4,2,1};
        int low=0;
        int high=arr.length-1;

        mergeSort(arr,low,high);
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;

        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merging(arr,low,mid,high);
    }

    public static void merging(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        List<Integer> list = new ArrayList<Integer>();
        while(left<=mid && right<=high){
            if(arr[left]>=arr[right]){
                list.add(arr[right++]);
            }
            else{
                list.add(arr[left++]);
            }
        }

        while (left<=mid){
            list.add(arr[left++]);
        }

        while (right<=high){
            list.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }

    }
}
