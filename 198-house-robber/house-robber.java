class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int []dp = new int[n];
        dp[0]= nums[0];

        return func(n-1,nums,dp);
    }
    private int func(int ind, int[] nums,int[] dp){
        for(int i=1;i<=ind;i++){
            int pick = nums[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int notPick =dp[i-1];
            dp[i]=Math.max(pick,notPick);
            
        }
        return dp[ind];
    }
}