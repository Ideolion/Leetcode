package Leetcode;

public class LongestPalindrome {

    public static void main(String[] args) {

        String result = LongestPalindrome("aacabdkacaa");
        System.out.println(result);
    }
    public static String LongestPalindrome(String s) {
        char[][] arrayOfOverlapSymbols = getArrayOfOverlapSymbols(s);
        String ResultStringWithPalindromes = getResultStringWithPalindromes(arrayOfOverlapSymbols);
        String longestPalindrome = getlongestPalindromeFromString(ResultStringWithPalindromes);
        return longestPalindrome;
   }

    private static char[][] getArrayOfOverlapSymbols(String s) {
        char[][] arrayOfOverlapSymbols = new char[s.length()][s.length()];
        for (int i = 0; i < s.length() ; i++) {
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt((s.length()-1)-j)) {
                    arrayOfOverlapSymbols[i][j] = s.charAt(i);
                } else {
                    arrayOfOverlapSymbols[i][j] = '0';
                }
            }
        }
      return arrayOfOverlapSymbols;
    }
    private static String getResultStringWithPalindromes(char[][] arrayOfOverlapSymbols) {

        String mainDiagonal = "0";
        String upTriangle = "0";
        String downTriangle = "0";

        for (int i = 0; i < arrayOfOverlapSymbols.length ; i++) {

           mainDiagonal = mainDiagonal + arrayOfOverlapSymbols[i][i];
        }
         for(int k=1;k<arrayOfOverlapSymbols.length;k++) {
             upTriangle = upTriangle + "0";
              for (int i = 0; i < k; i++) {
                  upTriangle = upTriangle + arrayOfOverlapSymbols[i][arrayOfOverlapSymbols.length - k + i];
              }
         }
        for(int k = arrayOfOverlapSymbols.length + 1; k < 2 * arrayOfOverlapSymbols.length; k++) {
            downTriangle = downTriangle + "0";
            for (int i = k - arrayOfOverlapSymbols.length; i < arrayOfOverlapSymbols.length; i++) {
                downTriangle = downTriangle + arrayOfOverlapSymbols[i][arrayOfOverlapSymbols.length - k + i];
            }
        }
        System.out.println(mainDiagonal);
        System.out.println(upTriangle);
        System.out.println(downTriangle);

        return mainDiagonal+upTriangle+downTriangle;
    }
    private static String getlongestPalindromeFromString(String resultStringWithPalindromes) {
        String result = "";

        String[] palindromesArray = resultStringWithPalindromes.split("0");
        for (int i = 0; i < palindromesArray.length; i++) {
            if(palindromesArray[i].length() > result.length()){
                result = palindromesArray[i];
            }
           // System.out.println(palindromesArray[i]);
        }
        return result;
    }



}



//        String s = "ccd";
//        String sReverse = new StringBuilder(s).reverse().toString();
//        int lengthOfArray = s.length();
//        char[] sArray = s.toCharArray();
//        char[] sReverseArray = sReverse.toCharArray();
//        char[][] selectionArray = new char[lengthOfArray][lengthOfArray];
//        String result = "";
//        String  mainDiag = "";
//        String  downTriangle = "";
//        String upTriangle = "";
//        String result1 = "";
//
//        if (lengthOfArray < 2 || sArray[0] == sArray[1]) {
//            result1 = s;
//        } else {
//            for (int i = 0; i < lengthOfArray; i++) {
//                for (int j = 0; j < lengthOfArray; j++) {
//                    if (sArray[i] == sReverseArray[j]) {
//                        selectionArray[i][j] = sArray[i];
//                    } else {
//                        selectionArray[i][j] = '0';
//                    }
//                    if (i == j) {
//                        mainDiag = mainDiag + selectionArray[i][j];
//                    }
//                }
//            }
//        }
//            for(int k=2;k<lengthOfArray;k++){
//              for(int i=0;i<k;i++) {
//                  upTriangle = upTriangle + selectionArray[i][lengthOfArray-k+i];
//              }
//                       }
//            for(int k=lengthOfArray+1;k<2*lengthOfArray-1;k++){
//               for(int i=k-lengthOfArray;i<lengthOfArray;i++){
//                   downTriangle = downTriangle + selectionArray[i][lengthOfArray-k+i];
//               }
//                 }
//        result = mainDiag+downTriangle+upTriangle;
//        System.out.println(mainDiag);
//        System.out.println(downTriangle);
//        System.out.println(upTriangle);
//
//        String[] parts = result.split("0");
//
//        for (int i = 0; i < parts.length; i++) {
//        }
//        for (int i = 0; i < parts.length-1; i++) {
//            if(result1.length() - parts[i+1].length()<0){
//                result1 = parts[i+1];
//                       }
//        }
//
//       System.out.println(result1);
//
//    }
//    }