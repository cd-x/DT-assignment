import java.rmi.Naming;
public class AccountClient {
    public static void main(String argv[]) {
        try {
            // Lookup account object
            Account rishiAcct = (Account)Naming.lookup("rmi:"+argv[0]+"/205118054");
            // Make deposit
            rishiAcct.deposit(15000);
            // Report results and balance.
            System.out.println("connected at:"+argv[0]);
            System.out.println("Deposited 15,000 into account owned by " + rishiAcct.getName());
            System.out.println("Balance now totals: " + rishiAcct.getBalance());
            rishiAcct.withdraw(5000);
            System.out.println("withdrawn 5,000 from account owned by " + rishiAcct.getName());
            System.out.println("Balance now totals: " + rishiAcct.getBalance());

        }
        catch (Exception e) {
            System.out.println("Error while looking up account:");
            e.printStackTrace();
        }
    }
}