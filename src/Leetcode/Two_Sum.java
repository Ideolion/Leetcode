/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leetcode;

import java.util.HashMap;

public class Two_Sum {
   
   public int[] twoSum(int[] nums, int target) {
    
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res = target - nums[i] ;
            if(map.containsKey(res)){
                return new int[] {map.get(res),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[] {0, 0};
   } 
   }
