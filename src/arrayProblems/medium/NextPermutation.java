package arrayProblems.medium;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        nextPermutation(arr);
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
    public static void nextPermutation(int[] arr) {
        // Your code goes here
        //[2,1,5,4,3,0,0]
        int index = -1;
        int n=arr.length;
        // find breakpoint index
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        // if index not updated then it is already the largest so reverse
        if(index == -1){
            reverse(arr,0,arr.length-1);
            return;
        }
        for(int i=n-1;i>index;i--){
            if(arr[index]<arr[i]){
                swap(arr,i,index);
                break;
            }
        }

        reverse(arr,index+1,arr.length-1);
    }

    private static void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    private static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
