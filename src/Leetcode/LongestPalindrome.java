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


