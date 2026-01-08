class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10){
            sum=0;
            while(num>0){
                int temp =num%10;//38%10=8
                sum+=temp;
                num =num/10; // 38/10= 3
           
            }
            num=sum;  // (num==11)
        }
        return num;
    }
}