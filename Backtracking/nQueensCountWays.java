public class nQueensCountWays {
    public static boolean isSafe(char board[][], int row, int col){
        // vertically up
        for (int i = row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // right diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // left diagonal
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void function(char board[][], int row){
        // base case
        if(row == board.length){
            // printboard(board);
            count++;
            return;
        }

        // recursion
        for (int col = 0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                function(board, row+1);  // function cal
                board[row][col] = 'x';  // Backtracking step
            }
        }
    }

    public static void printboard(char board[][]){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count;
    public static void main(String[] args) {
        int n = 10;
        char board[][] = new char[n][n];
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        function(board,0);

        System.out.println("Total no. of ways for nQueens : " + count);
    }
}

