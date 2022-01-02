/* https://leetcode.com/problems/decompress-run-length-encoded-list/ */
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int[]result = new int[size];
        int index=0;
        for(int i=1;i<nums.length;i+=2){
            for(int j=0;j<nums[i-1];j++){
                result[index++]=nums[i];
            }
        }
        return result;
        
    }
}
