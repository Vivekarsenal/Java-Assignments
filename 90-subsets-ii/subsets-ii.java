class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> subset= new ArrayList<>();
        backtrack(nums,subset,list,0);
        return subset;
    }
    private void backtrack(int[] nums,List<List<Integer>>subset,List<Integer>list,int start){
         Arrays.sort(nums);
        if(subset.contains(list))return;
        subset.add(new ArrayList<>(list));
        

        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])continue;
            list.add(nums[i]);
            backtrack(nums,subset,list,i+1);
            
            list.remove(list.size()-1);
        }
       

    }
}