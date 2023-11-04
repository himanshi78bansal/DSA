public class caseConversion {
    public static void main(String[] args) {
        for(char ch = 'A'; ch <= 'Z';ch++){
            System.out.print((char)(ch|' '));
        }
        System.out.println();
        System.out.println((int)'A');
        System.out.println((int)'a');
    }
    
}
