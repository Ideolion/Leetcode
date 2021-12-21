/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leetcode;

/**
 *
 * @author kiry
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
   
        boolean result = false;
     if((n > 0) && ((n & (n - 1)) == 0)) {
      result=true;
      }     
        
        
        return result;
    
        
        
        
    }


    
}
