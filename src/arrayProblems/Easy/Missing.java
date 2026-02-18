package arrayProblems.Easy;

public class Missing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        bruteForce(arr);
        better(arr);
        optimal(arr);
        betterOptimal(arr);
    }

    private static void betterOptimal(int[] arr) {
        int xor=0;
        int xor2=0;
        int n=arr.length+1;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
            xor2^=i+1;
        }
        xor2=xor2^n;
        System.out.println(xor^xor2);
    }

    private static void optimal(int[] arr) {
        int n=arr.length+1;
        int total=n*(n+1)/2;
        int sum=0;

        for(int i=0;i<arr.length;i++){{
            sum+=arr[i];
        }}

        System.out.println(total-sum);
    }

    private static void better(int[] arr) {
        int n=arr.length+1;
        int[] hash = new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static void bruteForce(int[] arr) {
        for(int i=1;i<= arr.length;i++){
            int flag=0;
            for(int j=0;j< arr.length;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
                break;
            }
        }

    }
}
