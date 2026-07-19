class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> list = new ArrayList<>();

       combinations(candidates,ans,list,target,0,0);
       return ans;
    }
    private void combinations(int[] nums, List<List<Integer>>ans,List<Integer> list, int target, int sum,int start){
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
            
        }
        if (sum > target) {
        return;
       }
        
       
        for(int i=start;i<nums.length;i++){
            
           
            list.add(nums[i]);
            combinations(nums, ans ,list,target,sum+nums[i],i);
            list.remove(list.size()-1);
           

            
        
    }
}
}