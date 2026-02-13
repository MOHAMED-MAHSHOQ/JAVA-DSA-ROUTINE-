package SortingAlgos;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {4,3,4,5,9,1,5,2,2,2};
        selectionSort(arr,0);
        for(int i : arr){
            System.out.print(i+" " );
        }
    }
    public static void selectionSort(int[] arr,int index){
        if(index== arr.length-1) return;
        int min=index;
        for(int i =index+1;i<=arr.length-1;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        int temp = arr[min];
        arr[min]=arr[index];
        arr[index]=temp;

        selectionSort(arr,index+1);




    }
}
