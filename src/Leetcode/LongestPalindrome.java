package Leetcode;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "ccd";
        String sReverse = new StringBuilder(s).reverse().toString();
        int lengthOfArray = s.length();
        char[] sArray = s.toCharArray();
        char[] sReverseArray = sReverse.toCharArray();
        char[][] selectionArray = new char[lengthOfArray][lengthOfArray];
        String result = "";
        String  mainDiag = "";
        String  downTriangle = "";
        String upTriangle = "";
        String result1 = "";

        if (lengthOfArray < 2 || sArray[0] == sArray[1]) {
            result1 = s;
        } else {
            for (int i = 0; i < lengthOfArray; i++) {
                for (int j = 0; j < lengthOfArray; j++) {
                    if (sArray[i] == sReverseArray[j]) {
                        selectionArray[i][j] = sArray[i];
                    } else {
                        selectionArray[i][j] = '0';
                    }
                    if (i == j) {
                        mainDiag = mainDiag + selectionArray[i][j];
                    }
                }
            }
        }
            for(int k=2;k<lengthOfArray;k++){
              for(int i=0;i<k;i++) {
                  upTriangle = upTriangle + selectionArray[i][lengthOfArray-k+i];
              }
                       }
            for(int k=lengthOfArray+1;k<2*lengthOfArray-1;k++){
               for(int i=k-lengthOfArray;i<lengthOfArray;i++){
                   downTriangle = downTriangle + selectionArray[i][lengthOfArray-k+i];
               }
                 }
        result = mainDiag+downTriangle+upTriangle;
        System.out.println(mainDiag);
        System.out.println(downTriangle);
        System.out.println(upTriangle);

        String[] parts = result.split("0");

        for (int i = 0; i < parts.length; i++) {
        }
        for (int i = 0; i < parts.length-1; i++) {
            if(result1.length() - parts[i+1].length()<0){
                result1 = parts[i+1];
                       }
        }

       System.out.println(result1);

    }
    }