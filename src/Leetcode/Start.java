/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Leetcode;

/**
 *
 * @author kiry
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    //https://leetcode.com/problems/two-sum/    
    var ts = new Two_Sum();   
    int[] nums = {2,7,11,15};
    int[] m = ts.twoSum(nums,9);
    System.out.println(m[0] + " "+m[1]);    
        
    //https://leetcode.com/problems/reverse-integer/    
    var ri = new ReverseInteger();
    int ResultReverseInteger = ri.reverse(123);
    System.out.println(ResultReverseInteger);        
        
    }
    
}
            
            
             
        
        
        

