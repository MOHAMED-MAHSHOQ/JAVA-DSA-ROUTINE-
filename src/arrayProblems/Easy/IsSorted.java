package arrayProblems.Easy;

import java.util.ArrayList;

public class IsSorted {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(new IsSorted().isSorted(list));
    }
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)<nums.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
