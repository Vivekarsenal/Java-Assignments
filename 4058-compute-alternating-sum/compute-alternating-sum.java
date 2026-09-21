class Solution {
    public int alternatingSum(int[] nums) {
        int sign =1;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            ans+=nums[i]*sign;
           
            sign*=(-1);
        }
        return ans;
    }
}