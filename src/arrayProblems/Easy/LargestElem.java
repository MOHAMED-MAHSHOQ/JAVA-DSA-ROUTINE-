package arrayProblems.Easy;

//brute   TC -->O(nlogn)
//optimal TC -->O(n)✅

public class LargestElem {
    public static void main(String[] args) {
        int[] arr = {4,3,4,15,559,9,1,2,3,8,9998};
//        System.out.println(brute(arr));
        System.out.println(optimal(arr));
    }

    public static int brute(int[] arr){
    mergeSort(arr,0,arr.length-1);
    return arr[arr.length-1];
    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int partitionElem=pivot(arr,low,high);
            mergeSort(arr,low,partitionElem-1);
            mergeSort(arr,partitionElem+1,high);
        }
    }
    public static int pivot(int[] arr,int low,int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;

        return j;

    }

    public static int optimal(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

}
