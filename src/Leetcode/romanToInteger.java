package Leetcode;

import java.util.HashMap;

public class romanToInteger {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = 0;
        HashMap<Character, Integer> dictionaryOfRomanNumbers = new HashMap<>();
        dictionaryOfRomanNumbers.put('I', 1);
        dictionaryOfRomanNumbers.put('V', 5);
        dictionaryOfRomanNumbers.put('X', 10);
        dictionaryOfRomanNumbers.put('L', 50);
        dictionaryOfRomanNumbers.put('C', 100);
        dictionaryOfRomanNumbers.put('D', 500);
        dictionaryOfRomanNumbers.put('M', 1000);

        char[] arrayOfSymbols = s.toCharArray();
        for (int i = 0; i < arrayOfSymbols.length; i++) {
            int buffer = dictionaryOfRomanNumbers.get(arrayOfSymbols[i]);
            if ((i+1) < arrayOfSymbols.length) {
                if (dictionaryOfRomanNumbers.get(arrayOfSymbols[i]) < dictionaryOfRomanNumbers.get(arrayOfSymbols[i + 1])) {
                    result = result - buffer;
                } else {
                    result = result + buffer;
                }
            } else {
                result = result + buffer;
            }
        }
        //return result;
        System.out.println(result);
    }
}
