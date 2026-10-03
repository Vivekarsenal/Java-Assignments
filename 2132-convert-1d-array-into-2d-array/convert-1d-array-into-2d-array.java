class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

         if((m*n)!=original.length)return new int[0][0];
        
        
        int [][] reshape = new int[m][n];

        for(int i=0;i<original.length;i++){
            int row =i/n;
            int col=i%n;
            reshape[row][col]=original[i];

        }
       

          return reshape;


        
    }
}