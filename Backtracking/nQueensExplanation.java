public class nQueensExplanation {
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
            System.out.println();
            System.out.println("final board");
            printboard(board);
            System.out.println();
            return;
        }

        // recursion
        for (int col = 0; col<board.length; col++){
            // if(isSafe(board, row, col)){       
                // if, if statement not applied than how nqueens can sit on a board(without safe box)
                System.out.println("Q entry");
                System.out.println("row: "+ row+" col " + col);
                board[row][col] = 'Q';
                printboard(board);

                System.out.println("function call");
                function(board, row+1);  // function cal

                System.out.println();
                System.out.println("backtrack");
                System.out.println("row: "+ row+" col " + col);
                board[row][col] = 'x';  // Backtracking step
                printboard(board);
            // }
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

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        function(board,0);
    }
}

