package arrayProblemsEasy;

public class Consecutive1s {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0};
        int max = 0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]==1){
                    cnt++;
                    max = Math.max(max,cnt);
                }
                else {
                    cnt = 0;
                }
        }
        System.out.println(max);
    }
}
