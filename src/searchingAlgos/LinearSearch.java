package searchingAlgos;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,3};
        int target=2;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }

        return -1;
    }
}
