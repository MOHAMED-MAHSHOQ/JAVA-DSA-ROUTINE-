package arrayProblems.Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[]arr1 = {1,2,2,3,4};
        int[]arr2 = {2,2,2,3};
//        int[] result = bruteForce(arr1, arr2);
//        System.out.println(Arrays.toString(result));
         List<Integer> result = twoPointer(arr1, arr2);
         Iterator it = result.iterator();
         while(it.hasNext()){
             System.out.print(it.next()+" ");}

    }
    //Time complexity O(n + m) where n and m are the lengths of the two arrays
    //Space complexity O(n) where n is the length of the smaller array
    private static List<Integer> twoPointer(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i]<arr2[i]){
                i++;
            }
            else{
                j++;
            }


        }

        return list;

    }

    //Time complexity O(n*m) where n and m are the lengths of the two arrays
    //Space complexity O(n) where n is the length of the smaller array
    public static int[] bruteForce(int[] arr1, int[] arr2){
        int[] visited = new int[arr2.length];
        List<Integer> list = new ArrayList<>();


        for(int i=0;i<arr1.length;i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && visited[j]==0) {
                    list.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                if(arr2[j]>arr1[i]) break;
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(int n : list){
            ans[i] = n;
            i++;
        }

        return ans;

    }


}
