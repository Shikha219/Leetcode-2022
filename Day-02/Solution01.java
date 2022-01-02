/* https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/ */
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s: sentences) {
            String[] str = s.split("\\s");
            max = Math.max(max,str.length);
        }
        return max;
    }
}
