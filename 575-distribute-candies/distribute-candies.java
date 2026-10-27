class Solution {
    public int distributeCandies(int[] candyType) {
       
        HashSet<Integer> set = new HashSet<>();

        for(int num:candyType){
            set.add(num);
        }

        int n = candyType.length;
        if(n/2==set.size())return n/2;
        
        if(set.size()>n/2)return n/2;
        


      return set.size();

    }
}