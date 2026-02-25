package arrayProblems.medium;

import java.util.Map;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int target=7;
        bruteForce(arr);
        kadanes(arr);

    }

    private static void kadanes(int[] arr) {
        int sum=0;
        int start=0;
        int activeStart=0;
        int activeEnd=0;
        int maxsum =Integer.MIN_VALUE;
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
            if(sum>maxsum){
                maxsum=Math.max(sum,maxsum);
                activeStart=start;
                activeEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=activeStart;i<activeEnd;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the sum is ------> "+maxsum);
    }

    private static void bruteForce(int[] arr) {
        int n=arr.length;
        int maxsum=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>maxsum){
                    maxsum = Math.max(maxsum,sum);
                }
            }

        }
        System.out.println(maxsum);
    }
}
