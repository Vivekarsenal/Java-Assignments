class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i}; // map.get(rem) gives index of rem
            }
            
            map.put(nums[i], i); // key = number, value = index
        }
        
        return new int[]{};
    }
}
