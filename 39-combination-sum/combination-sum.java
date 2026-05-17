import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ds = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        findcombination(0, target, candidates, ds, list);

        return ds;
    }

    private void findcombination(int idx,
                                 int target,
                                 int[] arr,
                                 List<List<Integer>> ans,
                                 List<Integer> list) {

        // BASE CASE
        if (idx == arr.length) {

            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }

            return;
        }

        // PICK
        if (arr[idx] <= target) {

            list.add(arr[idx]);

            // SAME INDEX because reuse allowed
            findcombination(idx,
                            target - arr[idx],
                            arr,
                            ans,
                            list);

            // BACKTRACK
            list.remove(list.size() - 1);
        }

        // NOT PICK
        findcombination(idx + 1,
                        target,
                        arr,
                        ans,
                        list);
    }
}