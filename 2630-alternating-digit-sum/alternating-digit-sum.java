class Solution {
    public int alternateDigitSum(int n) {
        String str=Integer.toString(n);
        int sign=1;
        int ans =0;
        for(char c:str.toCharArray()){
            int digit =c-'0';  // to convert it into int
            ans+=sign*digit;
            sign*=-1;
        }
        return ans;
    }
}