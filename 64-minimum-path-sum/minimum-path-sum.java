class Solution {
    public int minPathSum(int[][] grid) {
        int n =grid.length;
        int m=grid[0].length;
        int dp[][]= new int [n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return func(n-1,m-1,grid,dp);
    }
    private int func(int row, int col , int[][]grid, int [][]dp){
        if(row==0 && col==0)return grid[row][col];

        if(row<0 || col <0) return (int)1e9;
        if(dp[row][col]!=-1)return dp[row][col];


        int up= grid[row][col]+ func(row-1,col,grid,dp);
        int left=grid[row][col]+func(row,col-1,grid,dp);
        dp[row][col] = Math.min(up,left);
        return dp[row][col];
    }
}