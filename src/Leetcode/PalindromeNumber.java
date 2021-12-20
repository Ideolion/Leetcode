/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leetcode;

/**
 *
 * @author kiry
 */
public class PalindromeNumber {
  
    public boolean isPalindrome(int x) {
  boolean m = false;
        String s = Integer.toString(x);
if(x>=0 && x<10 ){
    m= true; }else
        if (x>10) {
            StringBuffer strBuffer = new StringBuffer(s);
            strBuffer.reverse();
            m = s.equals(strBuffer.toString());
        }


        return m;
    }  
}
