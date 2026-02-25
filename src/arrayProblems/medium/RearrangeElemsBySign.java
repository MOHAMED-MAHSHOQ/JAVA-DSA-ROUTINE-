package arrayProblems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElemsBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        bForcerem(arr);
        betterOpt(arr);
    }

    private static void betterOpt(int[] arr) {
        int n=arr.length;
        int[] temp = new int[n];
        int posidx=0;
        int negidx=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[negidx] = arr[i];
                negidx+=2;
            }
            else{
                temp[posidx] = arr[i];
                posidx+=2;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void bForcerem(int[] arr) {
        List<Integer> pos=  new ArrayList<>();
        List<Integer> neg=  new ArrayList<>();
        int n=arr.length;
        for(int i = 0 ; i < n;i++ ){
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }

        for(int i=0;i<n/2;i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
