import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findcombination(0,target,candidates,ans,list);

        return ans;
    }

    private void findcombination(int idx,int target,int[] arr, List<List<Integer>> ans, List<Integer> list) {

        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
           return;
        }

        


        if(arr[idx]<=target){
            list.add(arr[idx]);
            findcombination(idx,target-arr[idx],arr,ans,list);
            list.remove(list.size()-1);
        }
        findcombination(idx+1,target,arr,ans,list);
}
}