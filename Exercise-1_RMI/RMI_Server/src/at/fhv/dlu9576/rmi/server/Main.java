package at.fhv.dlu9576.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

            SimpleCalculator calculator = new SimpleCalculator();
            Naming.rebind("rmi://localhost/Calculator", calculator);

            System.out.println("Server is ready");
        } catch (RemoteException | MalformedURLException e) {
            System.out.println("Server exited with exception: " + e.getMessage());
        }
    }
}
