// Convert a given number into a string

public class numberToString {
    public static StringBuilder function(String str, int i, StringBuilder sb){
        if(i == str.length()){
            return sb;
        }
        if(str.charAt(i) == '0'){
            sb.append("zero ");
        } else if (str.charAt(i) == '1'){
            sb.append("one ");
        } else if (str.charAt(i) == '2'){
            sb.append("two ");
        } else if (str.charAt(i) == '3'){
            sb.append("three ");
        } else if (str.charAt(i) == '4'){
            sb.append("four ");
        } else if (str.charAt(i) == '5'){
            sb.append("five ");
        } else if (str.charAt(i) == '6'){
            sb.append("six ");
        } else if (str.charAt(i) == '7'){
            sb.append("seven ");
        } else if (str.charAt(i) == '8'){
            sb.append("eight ");
        } else if (str.charAt(i) == '9'){
            sb.append("nine ");
        }
        return function(str, i+1, sb);
    }
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eigth","nine"};

    public static void profunction(int n){
        if(n == 0){
            return;
        }

        int lastDigit = n % 10;
        profunction(n/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void main(String[] args) {
        int n = 25121999;
        String str = Integer.toString(n);
        System.out.println(function(str,0,new StringBuilder("")));
        
        profunction(20071995);
    }
}
