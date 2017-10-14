package main;

import java.rmi.RemoteException;

import controller.RMILoginController;
import view.RMIServerFrm;

public class ServerRun {
	public static void main(String[] args) {
		try {
			RMILoginController rmiServer = new RMILoginController();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		RMIServerFrm serverFrm = new RMIServerFrm();
		serverFrm.setVisible(true);
	}
	
}
