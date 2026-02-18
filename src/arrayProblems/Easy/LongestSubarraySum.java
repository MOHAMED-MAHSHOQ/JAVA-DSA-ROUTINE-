package arrayProblems.Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] arr ={2,0,0,3};
        int k=3;
        brute(arr,k);
        betterbrute(arr,k);
        better(arr,k);
        optimals(arr,k);
    }
    private static void optimals(int[] nums,int k){
        int left = 0;
        int sum = 0;
        int maxLen = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        System.out.println("lonegest subarray with sum "+k+" is "+maxLen);    }

    private static void better(int[] arr,int k) {
        int n =arr.length;
        int maxlen = 0;
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen = Math.max(maxlen,i+1);
            }

            int rem = sum-k;
            if(map.containsKey(rem)){
                int len = i-map.get(rem);
                maxlen = Math.max(maxlen,len);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println("lonegest subarray with sum "+k+" is "+maxlen);
    }

    private static void betterbrute(int[] arr, int k) {
        int n=arr.length;
        int len=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    len=Math.max(len,j-i+1);
                }
            }

        }
        System.out.println("lonegest subarray with sum "+k+" is "+len);
    }

    private static void brute(int[] arr, int t) {
        int n=arr.length;
        int len=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==t) len=Math.max(len,j-i+1);
            }
        }
        System.out.println("lonegest subarray with sum "+t+" is "+len);
    }
}
