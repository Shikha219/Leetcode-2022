/* https://leetcode.com/problems/decode-xored-array/ */
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length+1;
        int[] a=new int[n];
        a[0]=first;
        for(int i=1;i<n;i++)
            a[i]=a[i-1]^encoded[i-1];
        return a;
        
    }
}
