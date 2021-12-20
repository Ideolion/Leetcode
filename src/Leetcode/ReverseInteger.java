/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leetcode;

/**
 *
 * @author kiry
 */
public class ReverseInteger {

    public int reverse(int x) {
int m = 0;
        String s = Integer.toString(x);
        try {
            if (x > 0) {
                StringBuffer strBuffer = new StringBuffer(s);
                strBuffer.reverse();
                m = Integer.parseInt(String.valueOf(strBuffer));
            } else if (x == 0) {
                m = x;

            } else {
                StringBuffer strBuffer = new StringBuffer(s);
                strBuffer.deleteCharAt(0);
                strBuffer.reverse();
                m = -Integer.parseInt(String.valueOf(strBuffer));
            }
        } catch (NumberFormatException e) {
                return 0;
            }

        return m;
        
    } 
}
