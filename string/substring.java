// find the count of all contiguous substring starting and ending with the same character.

public class substring {
    public static int function(String str, int count){

        for (int i = 0; i<str.length(); i++){

            for (int j = i; j<str.length(); j++){
                
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(function("abcab", 0));
    }
}
