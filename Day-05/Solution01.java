/* https://leetcode.com/problems/pascals-triangle/ */
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList();
        int [][] dp = new int [n][n];
        dp[0][0]=1;
        
        for(int i=1;i<n;i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
            for(int j=1;j<i;j++){
                dp[i][j]= dp[i-1][j-1]+dp[i-1][j];
            }
        }
        
        for(int i=0;i<n;i++){
            ArrayList<Integer> list = new ArrayList();
            for(int j=0;j<=i;j++){
                list.add(dp[i][j]);
            }
            ans.add(list);
        }
        return ans;
    }
}
