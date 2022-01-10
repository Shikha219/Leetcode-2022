/* https://leetcode.com/problems/sum-of-all-odd-length-subarrays/ */
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int oddsum = 0;
        for(int i = 0;i<arr.length;i++) {
            oddsum = oddsum + (((i+1)*(arr.length-i)+1)/2)*arr[i];
        }return oddsum;
        
    }
}
