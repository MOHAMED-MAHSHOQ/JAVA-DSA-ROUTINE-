package arrayProblems.Easy;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestInArrayLst {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(559066);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(9998);
        System.out.println(secondLargestElement(list));
    }
    public static int secondLargestElement(List<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
                if(nums.get(i)>largest){
                    secondlargest=largest;
                    largest=nums.get(i);
                } else if (nums.get(i)<largest && nums.get(i)>secondlargest) {
                    secondlargest=nums.get(i);
                }
        }
        if(secondlargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondlargest;

    }
}
