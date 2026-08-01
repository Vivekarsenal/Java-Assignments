class Solution {
    public boolean predictTheWinner(int[] nums) {
        return findsum(nums, 0 , nums.length-1)>=0;
    }
    private static int findsum(int[] nums, int left , int right){
         if(left==right){
            return nums[left] ;  // because of both are equal then player one will be the winner
         }

         int leftpick=nums[left]-findsum(nums,left+1,right);

         int rightpick = nums[right]-findsum(nums,left, right-1);


         return Math.max(leftpick,rightpick);
    }
}