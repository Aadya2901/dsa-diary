public class Access_Modifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "aadyapatel";
        myAcc.setPassword("abcd@123");
        myAcc.displayPassword();
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

    public void displayPassword() {
        System.out.println("Password: " + password);
    }
}

/*
 * Access Modifiers Summary:
 * Modifier Class Package Subclass World
 * public ✅ ✅ ✅ ✅
 * protected ✅ ✅ ✅ ❌
 * default (no modifier) ✅ ✅ ❌ ❌
 * private ✅ ❌ ❌ ❌
 * 
 * So in your case:
 * 
 * username is public, so it's accessible from anywhere.
 * 
 * password is private, so it's only accessible within BankAccount.
 */
