/*
 * 344. Reverse String
 * Author: Tomiris
 * Date:2019-09-09
 */
 
class Solution {
    public void reverseString(char[] s) { 
        int j = s.length - 1;
        for (int i = 0; i <= j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
