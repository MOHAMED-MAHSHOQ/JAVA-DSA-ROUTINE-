package arrayProblems.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SizeOfUniqueElems {
    public static void main(String[] args) {
        int[] arr = {1,55,4,3,2,1};
        System.out.println(new SizeOfUniqueElems().bruteForce(arr));
        System.out.println(new SizeOfUniqueElems().optimalSolution(arr));
    }
    public int bruteForce(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int n : arr){
            set.add(n);
        }
        int i=0;
        for(int n : set){
            arr[i]=n;
            i++;
        }
        return i;
    }
    public int optimalSolution(int[] arr){
        int i=0;
        Arrays.sort(arr);
        for(int j=1;j<arr.length;j++){
            {
                if(arr[i]!= arr[j]){
                    arr[i+1]=arr[j];
                    i++;
                }
            }
        }
        return i+1;
    }
}
