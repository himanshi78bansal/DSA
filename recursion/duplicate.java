public class duplicate {
    public static void function(String name, int i, StringBuilder sb, boolean map[]){
        // base case
        if (i == name.length()){
            System.out.println(sb);
            return;
        }

        // kaam
        char currChar = name.charAt(i);
        if(map[currChar-'a'] == true){
            // duplicate
            function(name, i+1, sb, map);
        } else {
            map[currChar-'a'] = true;
            function(name, i+1, sb.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String name = "himanshi";
        function(name, 0, new StringBuilder(""), new boolean[26]);
    }
}
