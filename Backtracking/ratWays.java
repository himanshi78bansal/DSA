class ratWays{
    public static int [][] function(int maze[][], int i, int j){
        //base case
        if(i==maze.length || j==maze.length-1){

        }
        // recursion
        function(maze, i, j-1);   //left
        function(maze, i, j+1);   //right
        function(maze, i-1, j);   //up
        function(maze, i+1, j);   //down

        return maze;
    }
    public static void printfun(int maze[][]){
        for (int i = 0; i<maze.length; i++){
            for(int j = 0; j<maze.length; j++){
                System.out.println(maze[i][j]);
            }
        }
    }
    public static void main(String[] args){
        int maze[][] = {{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        function(maze, 0, 0);
        printfun(maze);
    }
}
,