import java.rmi.Naming;
public class RegAccount {
    public static void main(String argv[]) {
        try {
            // Make an Account with a given name
            AccountImpl acct = new AccountImpl("205118054");
            // Register it with the local naming registry
            System.out.println("running on:"+argv[0]);
            Naming.rebind("rmi://"+argv[0]+"/205118054", acct);
            System.out.println("account registred.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}