public class uppercase {
    public static String function(String str){ 

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));    // first letter uppercase done
        sb.append(ch);

        for (int i = 1; i < str.length(); i++){     // time comp = O(n)
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, my name is himanshi bansal";
        char ch = Character.toUpperCase(str.charAt(0));
        System.out.println(ch);
        System.out.println(function(str));
    }
    
}
