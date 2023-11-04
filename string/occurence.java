// Count how many times lowercase vowels occured in a string entered by the user 

public class occurence{
    public static int function(String str){
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(function(str));
    }
}