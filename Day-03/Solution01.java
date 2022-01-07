/* https://leetcode.com/problems/find-first-palindromic-string-in-the-array/submissions/ */
class Solution {
    public static boolean isPalindrome(String str) {
        int l = 0,r = str.length()-1;
        char ch[] = str.toCharArray();
        while(l<r) {
            if(ch[l]==ch[r]) {
                l++;r--;
            }else return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String word:words) {
            if(isPalindrome(word)==true) {
                return word;
            }
        }return "";
    }
}
