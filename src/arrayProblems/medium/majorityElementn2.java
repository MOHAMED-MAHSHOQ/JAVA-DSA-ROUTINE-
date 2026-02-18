package arrayProblems.medium;

import java.util.HashMap;
import java.util.Map;

public class majorityElementn2 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,6,6,2,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,1};
        bruteForce(arr);
        betterForce(arr);
        optimalmoore(arr);
    }
//moore's voting algorithm
    private static void optimalmoore(int[] arr) {
        int n=arr.length;
        int cnt=0;
        int actualcnt=0;
        int candidate = -1;
        for(int i=0;i<n;i++){
            if(cnt==0) {
                cnt++;
                candidate = arr[i];
            }
            else if(arr[i]==candidate){
                cnt++;
            }
            else {
                cnt--;

            }
        }
        for (int num : arr){
            if(num==candidate){
                actualcnt++;
            }
        }
        if(actualcnt>n/2) {
            System.out.println(candidate + "   " + actualcnt);
        }
    }

    private static void betterForce(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if((int)entry.getValue() > n/2){
                System.out.println(entry.getKey()+"   "+entry.getValue());
                break;
            }
        }
    }

    private static void bruteForce(int[] arr) {
        int n=arr.length;
        for (int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if (cnt>n/2){
                System.out.println(arr[i]+"   "+cnt);
                break;
            }
        }
    }
}

