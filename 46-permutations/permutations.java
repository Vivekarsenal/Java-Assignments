class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean freq[]= new boolean[nums.length];
        findpermutation(nums,ds,ans,freq);
        return ans;
    }
    private void findpermutation(int[] nums, ArrayList<Integer> ds,List<List<Integer>> ans, boolean [] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));  // base case
            return;
        }
        for(int i=0;i<nums.length;i++){
        if(!freq[i]){
            freq[i]=true;
            ds.add(nums[i]);
            findpermutation(nums,ds,ans,freq);
            ds.remove(ds.size()-1);
            freq[i]=false;

        }
    }
}
}