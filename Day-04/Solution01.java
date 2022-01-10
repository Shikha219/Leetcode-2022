/* https://leetcode.com/problems/maximum-subarray/ */
class Solution {
    public int maxSubArray(int[] nums) {
        int cursum = 0,maxsum = Integer.MIN_VALUE;
        //Kadane's Algorithm -> O(n)
        for(int i = 0;i<nums.length;i++) {
            cursum = cursum + nums[i];
            if(cursum>maxsum) {
                maxsum = cursum;
            }
            if(cursum<0) {
                cursum = 0;
            }
        }return maxsum;
    }
}
