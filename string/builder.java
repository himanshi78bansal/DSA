public class builder{
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello World!");
        System.out.println(sb);

        // example of mutablity

        StringBuilder english = new StringBuilder ("");   // empty string

        for(char i = 'a'; i<='z'; i++){   // time comp = O(26)
            english.append(i);
        }
        System.out.println(english);

        // length() function
        System.out.println(english.length());

    }
}