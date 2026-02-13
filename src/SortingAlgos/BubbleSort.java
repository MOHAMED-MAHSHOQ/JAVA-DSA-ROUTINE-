package SortingAlgos;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {4,5,3,4,9,1,8,34,90,1,3};
        int[] arr = {1,2,3,4,5};

        for(int i= arr.length-1;i>=0;i--){
            boolean didSwap=false;
            for(int j=0;j<=i-1;j++){
//                System.out.println("run"+ j);
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                    didSwap=true;
                }
            }
            if(!didSwap){
                break;
            }
        }



        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
