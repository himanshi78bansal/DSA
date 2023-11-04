public class shortestpath {
    public static void function(int x, int y){
        int X2 = x*x;
        int Y2 = y*y;
        float value = (float) Math.sqrt(X2 + Y2);
        System.out.println(value);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x=0;
        int y=0;
        for (int i = 0; i<str.length(); i++){
            // EAST
            if(str.charAt(i)=='E'){
                x++;
            } 
            // WEST
            else if (str.charAt(i)=='W'){
                x--;
            }
            // NORTH
            else if(str.charAt(i)=='N'){
                y++;
            }
            // SOUTH
            else if (str.charAt(i)=='S'){
                y--;
            }
        }
        function(x,y);
    }
}
