class Solution {
    public int differenceOfSum(int[] nums) {
      int esum =0;
      for(int i=0;i<nums.length;i++){
        esum+=nums[i];
      }
       int dsum=0;
      for(int num :nums){
        
        int temp=num;

        while(temp>0){
            dsum+=temp%10;
            temp=temp/10;

        }

      }

      return Math.abs(esum-dsum);

    }
}