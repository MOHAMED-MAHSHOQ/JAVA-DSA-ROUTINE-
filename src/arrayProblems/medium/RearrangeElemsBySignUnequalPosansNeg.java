package arrayProblems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElemsBySignUnequalPosansNeg {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4,-6};
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        if(pos.size() > neg.size()){
            for(int i=0;i<neg.size();i++){
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            arr[2*neg.size()]=pos.get(neg.size());
        }
        else{
            for(int i=0;i<pos.size();i++){
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            arr[2*pos.size()]=neg.get(pos.size());
        }
        System.out.println(Arrays.toString(arr));
    }
}
