public class NQueens {

    public static void main(String[] args) {
        int n = 4; // Change the value of n for different board sizes
        solveNQueens(n);
    }

    private static void solveNQueens(int n) {
        int[][] board = new int[n][n];

        if (!solveNQueensUtil(board, 0, n)) {
            System.out.println("Solution does not exist");
        } else {
            displayBoard(board);
        }
    }

    private static boolean solveNQueensUtil(int[][] board, int col, int n) {
        if (col >= n) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n)) {
                board[i][col] = 1;

                if (solveNQueensUtil(board, col + 1, n)) {
                    return true;
                }

                board[i][col] = 0; // Backtrack
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int n) {
        int i, j;

        // Check this row on the left side
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void displayBoard(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

                        // 0 0 1 0
                        // 1 0 0 0
                        // 0 0 0 1
                        // 0 1 0 0




                        