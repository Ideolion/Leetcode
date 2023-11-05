package Leetcode;

import java.util.Arrays;
import java.util.List;

public class RemoveDup {

    public static void main(String[] args) {

        int[] num = new int[]{1,1,2,3,8,5,4,1};

        int result = removeDuplicates(num);

    }

    public static int removeDuplicates(int[] nums) {
        int[] num = Arrays.stream(nums).sorted().toArray();
        List<Integer> arlint = new List<>();
        for (int i = 0; i < nums.length-1; i++) {
            if(num[i] == num[i+1]){
            }



            System.out.println(nums[i]);

        }




        return 0;
    }


}
