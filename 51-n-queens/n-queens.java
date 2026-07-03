class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        
        // Initialize an empty chessboard filled with '.'
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Lookup arrays to check restrictions in O(1) time
        boolean[] leftRow = new boolean[n];
        boolean[] lowerDiagonal = new boolean[2 * n - 1];
        boolean[] upperDiagonal = new boolean[2 * n - 1];
        
        // Kick off the backtracking process from the first column (0)
        solve(0, board, res, leftRow, lowerDiagonal, upperDiagonal, n);
        return res;
    }
    private void solve(int col, char[][] board, List<List<String>> res, 
                       boolean[] leftRow, boolean[] lowerDiagonal, boolean[] upperDiagonal, int n) {
        
        // Base Case: All queens are placed successfully
        if (col == n) {
            res.add(construct(board));
            return;
        }

        // Try placing a queen in each row for the current column
        for (int row = 0; row < n; row++) {
            
            // Check if placing a queen here is safe
            if (!leftRow[row] && !lowerDiagonal[row + col] && !upperDiagonal[n - 1 + col - row]) {
                
                // Placement step
                board[row][col] = 'Q';
                leftRow[row] = true;
                lowerDiagonal[row + col] = true;
                upperDiagonal[n - 1 + col - row] = true;

                // Move to the next column
                solve(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal, n);

                // Backtracking step
                board[row][col] = '.';
                leftRow[row] = false;
                lowerDiagonal[row + col] = false;
                upperDiagonal[n - 1 + col - row] = false;
            }
        }
    }
    private List<String> construct(char[][] board) {
        List<String> path = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }
   
}