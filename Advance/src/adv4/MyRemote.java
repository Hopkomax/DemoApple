package adv4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
	
	String getMessage() throws RemoteException;

}
