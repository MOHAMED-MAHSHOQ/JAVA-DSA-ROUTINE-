package arrayProblems.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 6, 3};

        int target = 6;
        int[] arr1= new TwoSumInArray().brute(arr, target);
        System.out.println(Arrays.toString(arr1));
        int[] arr2= better(arr, target);
        System.out.println(Arrays.toString(arr2));
        System.out.println(optimal(arr,target));
    }

    private static String optimal(int[] arr,int target){
        int i=0;
        int j = arr.length-1;
        Arrays.sort(arr); //1,2,3,3,4,6
        while (i<j){
            if(arr[i]+arr[j]==target){
                return "solution found at index "+i+" and "+j;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else {
                i++;
            }
        }
        return "No solution";
    }
private static int[] better(int[] arr,int target){
    Map<Integer,Integer> map = new HashMap<>();

    for(int i = 0; i < arr.length; i++){

        int complement = target - arr[i];

        if(map.containsKey(complement)){
            return new int[]{ map.get(complement), i };
        }

        map.put(arr[i], i);
    }

    return new int[]{-1, -1};
}
    private int[] brute(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}