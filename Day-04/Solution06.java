/* https://leetcode.com/problems/truncate-sentence/ */
class Solution {
    public String truncateSentence(String s, int k) {
        return String.join(" ", Arrays.copyOfRange(s.split(" "), 0, k));
    }
}
