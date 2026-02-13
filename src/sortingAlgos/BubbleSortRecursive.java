package sortingAlgos;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {4,2,3,4,5,9,1,6,8,9,11,1};
        bubbleSort(arr,arr.length-1);
        for(int i : arr){
            System.out.print(i+" " );
        }
    }
    public static void bubbleSort(int[] arr,int n){
        if(n<0) return;

        for(int i=0;i<=n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }


        bubbleSort(arr,n-1);

    }
}
