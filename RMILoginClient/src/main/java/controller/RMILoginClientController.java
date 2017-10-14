package controller;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import model.User;

public class RMILoginClientController {
	private String serverHost = "localhost";
	private int serverPort = 1796;
	private RMILoginInterface rmiServer;
	private String rmiService = "rmiLoginxxx";
	private Registry registry;
	public String getServerHost() {
		return serverHost;
	}
	public void setServerHost(String serverHost) {
		this.serverHost = serverHost;
	}
	public int getServerPort() {
		return serverPort;
	}
	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}
	public RMILoginInterface getRmiServer() {
		return rmiServer;
	}
	public void setRmiServer(RMILoginInterface rmiServer) {
		this.rmiServer = rmiServer;
	}
	public String getRmiService() {
		return rmiService;
	}
	public void setRmiService(String rmiService) {
		this.rmiService = rmiService;
	}
	public Registry getRegistry() {
		return registry;
	}
	public void setRegistry(Registry registry) {
		this.registry = registry;
	}
	public RMILoginClientController() {
		try {
			registry = LocateRegistry.getRegistry(serverHost, serverPort);
			rmiServer = (RMILoginInterface) registry.lookup(rmiService);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}	
	}
	
	public boolean remoteCheckLogin(User user) {
		boolean res = false;
		try {
			res = rmiServer.checkLogin(user);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return res;
	}
}
