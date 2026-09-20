class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int num:nums){
            String str= Integer.toString(num);
            for(char c:str.toCharArray()){
                list.add(c-'0');
            }
        }
        int[] array = new int [list.size()];

        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
      return array;
    }
}