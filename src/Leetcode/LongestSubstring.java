/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kiry
 */
public class LongestSubstring {
 
    public int lengthOfLongestSubstring(String s) {
     Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int i = 0;
        while (i < s.length()) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                i = map.get(c);
                res = Math.max(res, map.size());
                map.clear();
            } else {
                map.put(c, i);
            }
            i++;
        }
        res = Math.max(res, map.size());
        return res;
     
        
        
    }
    
    
    
    
}
