package at.fhv.dlu9576.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SimpleCalculator extends UnicastRemoteObject implements Calculator {

    public SimpleCalculator() throws RemoteException {
        super();
    }

    @Override
    public int calculateSquare(int value) throws RemoteException {
        return value * value;
    }
}
