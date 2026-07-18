class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>subset = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        backtrack(nums, subset,list,0);
        return subset;


    }
    private void backtrack(int[] nums,List<List<Integer>>subset, List<Integer>list, int start){
        subset.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){
        list.add(nums[i]);
        backtrack(nums,subset,list,i+1);
        list.remove(list.size()-1);
        }


    }
}