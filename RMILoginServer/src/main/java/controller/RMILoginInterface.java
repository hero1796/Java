package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.User;

public interface RMILoginInterface extends Remote {
	public boolean checkLogin(User user) throws RemoteException;
}
