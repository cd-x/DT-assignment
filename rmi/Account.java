import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
public interface Account extends Remote {
    public String getName() throws RemoteException;
    public float getBalance() throws RemoteException;
    public void withdraw(float amt) throws RemoteException;
    public void deposit(float amt) throws RemoteException;
    public void transfer(float amt, Account src) throws RemoteException;
    public void transfer(List amts, List srcs) throws RemoteException;
}