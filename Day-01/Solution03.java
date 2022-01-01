/* https://leetcode.com/problems/final-value-of-variable-after-performing-operations/ */
class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x = 0;
        for(int i = 0;i<op.length;i++) {
            switch(op[i]) {
                case "--X":
                    --x;
                    break;
                case "X--":
                    x--;
                    break;
                case "++X":
                    ++x;
                    break;
                case "X++":
                    x++;
                    break;
            }
        }return x;
        
    }
}
