/* https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/ */
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int output[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int count =0;
            for(int j = 0;j<nums.length;j++) {
                if((j!=i) && (nums[j]<nums[i])){
                    count++;
                }
            }output[i] = count;
        }return output;
            
    }
}
