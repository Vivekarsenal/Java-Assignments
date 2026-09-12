class Solution {
    
    public int climbStairs(int n) {
        int memo[] = new int[n+1];
        Arrays.fill(memo,-1);
        
        return func(n, memo);
    }
    private int func(int n , int[] memo){

        if(n==0||n==1)return 1;

        if(memo[n]!=-1)return memo[n];

        memo[n]=func(n-1,memo)+func(n-2,memo);

        return memo[n];
    }
   
}