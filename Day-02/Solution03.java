/* https://leetcode.com/problems/richest-customer-wealth/ */
class Solution {
    public int maximumWealth(int[][] account) {
        int max = 0,sum=0;
        for(int i =0;i<account.length;i++) {
            for(int j = 0;j<account[i].length;j++) {
                sum+=account[i][j];
            }max = Math.max(max,sum);sum=0;
        }return max;
        
    }
}
