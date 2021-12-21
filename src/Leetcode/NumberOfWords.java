/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leetcode;

import java.util.regex.Pattern;

/**
 *
 * @author kiry
 */
public class NumberOfWords {

    public int countValidWords(String sentence) {

        int count = 0;
        Pattern pat = Pattern.compile("([a-z]*([a-z]+[-]{0,1}[a-z]+){0,1}[.!,\\s]{0,1})");
        String[] lists = sentence.split(" ");
        for (String str : lists) {
            if (!str.isBlank() && pat.matcher(str).matches()) {
                count++;

            }

        }
        return count;

    }

}
