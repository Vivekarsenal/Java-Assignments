class Solution {
    public int thirdMax(int[] nums) {
       
         TreeSet<Integer> set = new TreeSet<>();
        
        // Add all numbers (TreeSet keeps them sorted and unique)
        for (int num : nums) {
            set.add(num);
        }
        
        // If less than 3 distinct numbers → return max
        if (set.size() < 3) {
            return set.last();
        }
        
        // Otherwise, remove the largest twice and return the next
        set.remove(set.last()); // remove largest
        set.remove(set.last()); // remove second largest
        return set.last();   
    }
}