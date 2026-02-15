package arrayProblemsEasy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,4,4,5,5,5,5,7,7};
        System.out.println(brute(arr));
        System.out.println(better(arr));
        System.out.println(optimals(arr));
    }

    private static int optimals(int[] arr) {
        int xor=0;
        for(int n : arr){
            xor^=n;
        }
        return xor;
    }

    public static int better(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry m : map.entrySet()){
            if((int)m.getValue()==1){
                return  (int) m.getKey();
            }
        }
        return -1;
    }
    public static int brute(int[] arr){
        int n= arr.length;

        for (int i=0;i<n;i++){
            int num =arr[i];
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    cnt++;
                }
            }
            if(cnt==1){
                return num;
            }
        }

        return -1;
    }
}
