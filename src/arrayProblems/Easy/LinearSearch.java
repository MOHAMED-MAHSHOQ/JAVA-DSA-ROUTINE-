package arrayProblems.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,5,6,7,7,8,9};
        int target = 7;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }
}
