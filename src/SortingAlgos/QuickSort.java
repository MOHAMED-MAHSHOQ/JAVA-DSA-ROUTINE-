package SortingAlgos;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,3,4,5,9,4,1,2,3};
        QuickSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" " );
        }
    }
    public static void QuickSort(int[] arr, int low, int high){

        if(low<high) {
            int partitionIndex = pivot(arr, low, high);
            QuickSort(arr, low, partitionIndex - 1);
            QuickSort(arr, partitionIndex + 1, high);
        }

    }

    public static int pivot(int[] arr,int low,int high){
        int pivot=arr[low];
        int i =low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[j];
        arr[j]=arr[low];
        arr[low]=temp;

        return j;
    }
}
