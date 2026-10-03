class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col= mat[0].length;

        if(row*col != r*c)return mat;

        int[][]reshape= new int[r][c];
        int m=0;
        int n=0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                reshape[m][n]=mat[i][j];
                n++;
            
            if(n==c){
                n=0;
                m++;
            }
        }
        }
        return reshape;

    }
}