package arrayProblems.Easy;

import java.util.ArrayList;
import java.util.List;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,2,0,2,0,3,2,1,3,0,3,1,2,3,4,7,0,0,0,0,0,0,0,7,6,5,4,3,2,2};
//        new moveZeroes().bruteForce(arr);
        new moveZeroes().optimalApproach(arr);

        for(int i : arr){
            System.out.print(i+" " );
        }
    }
    //Tc for brute force is O(n) and space complexity is O(n)
    public void bruteForce(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(i!=0){
                list.add(i);
            }
        }
        int j=0;
        for(int i : list){
            arr[j++]=i;
        }

            while(j<arr.length){
                arr[j++]=0;
            }


    }

    //Tc for optimal approach is O(n) and space complexity is O(1)
    public void optimalApproach(int[] arr) {
        int j=-1;
        int n=arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
               int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

}
