package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import model.User;

public class RMILoginController extends UnicastRemoteObject implements RMILoginInterface {
	private static final long serialVersionUID = 1L;

	private DAO dao = new DAO();
	private int serverPort = 1796;
	private Registry registry;
	private String rmiService = "rmiLoginxxx";

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public RMILoginController() throws RemoteException {
		try {
			registry = LocateRegistry.createRegistry(serverPort);
			registry.rebind(rmiService, this);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public String getRmiService() {
		return rmiService;
	}

	public void setRmiService(String rmiService) {
		this.rmiService = rmiService;
	}

	public boolean checkLogin(User user) {
		System.out.println("start check");
		return dao.checkLogin(user);
	}

}
