public class accessSpecifier {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        b1.username = "Himu";
        System.out.println(b1.username);
        // String password = b1.password;      not possible since it's private
        b1.changePass("Hello");     // can change using function but cannot access
    }

}

class BankAccount{
    public String username;
    private String password;

    void changePass(String pwd){
        password = pwd;
        System.out.println(password);   // accessible only in the class
    }
}
