package sortingAlgos;

public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {4,2,3,4,5,9,1,2,34,2,1,0,9,8,7,453,2};
        insertionSort(arr,1);
        for(int i : arr){
            System.out.print(i+" " );
        }
    }
    public static void insertionSort(int[] arr,int i){
        if(i > arr.length-1) return;


        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;

        insertionSort(arr,i+1);

    }
}
