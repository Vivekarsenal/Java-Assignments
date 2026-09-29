class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
          int min =nums[0];
          int max=nums[nums.length-1];
          
        for(int no : nums){
            if(no!=min && no!=max){
                return no;
                 
            }
            
        }
         return -1;
    }
}