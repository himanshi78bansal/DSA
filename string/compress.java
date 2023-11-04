public class compress {
    
    // Using String
    public static String stringfunction(String str){

        String newstr = "";
        for (int i = 0; i < str.length(); i++){    // time comp = O(n)
            Integer count = 1; 
            while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);   // add character
            
            if (count > 1){
                newstr += count.toString();   // add number of occurence 
            }
        }
        return newstr;
    }

    // Using StringBuilder
    public static String builderfunction(String str){

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbcccdd";
        System.out.println(stringfunction(str));
        System.out.println(builderfunction(str));
    }
}
