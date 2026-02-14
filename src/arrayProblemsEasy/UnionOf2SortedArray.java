package arrayProblemsEasy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UnionOf2SortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,8};
        int[] arr2={1,2,3,4,5,6,7};
//        union(arr1,arr2);
        optimalUnion(arr1,arr2);
    }

    // TC: O(n + m) where n = arr1.length, m = arr2.length - Single pass through both arrays
    // SC: O(n + m) for storing the union result in ArrayList
    private static void optimalUnion(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(list.isEmpty() || list.getLast()!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(list.isEmpty() || list.getLast()!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
            else{
                if(list.isEmpty() || list.getLast()!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<arr1.length){
                if(list.isEmpty() || list.get(list.size()-1)!=arr1[i]){
                        list.add(arr1[i]);
                }
                i++;
        }
        while(j<arr2.length){
                if(list.isEmpty() || list.get(list.size()-1)!=arr2[j]){
                        list.add(arr2[j]);
                }
                j++;
        }


        for(int n : list){
            System.out.print(n+" ");
        }
    }

    // TC: O(n + m) where n = arr1.length, m = arr2.length
    // SC: O(n + m) for LinkedHashSet and result array
    private static void union(int[] arr1, int[] arr2) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        int[] num = new int[set.size()];
        int i = 0;
        for (int val : set) {
            num[i++] = val;
        }

        for(int n:num){
            System.out.print(n+" ");
        }
    }
}
