public class shuffle {

    public static String function(String str, int[] indices){
        char s1[] = new char[str.length()]; 
        for(int i = 0; i<str.length(); i++){
            s1[(indices[i])] = str.charAt(i);
        }
        return String.valueOf(s1);
    }

    public static String function1(String str, int[] indices){
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i<str.length(); i++){
            sb.setCharAt(indices[i], str.charAt(i));
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
        String str = "codeleet";
        int indices[] = {4,5,6,7,0,2,1,3};
        System.out.println(function(str, indices));
        System.out.println(function1(str, indices));
    }
}
