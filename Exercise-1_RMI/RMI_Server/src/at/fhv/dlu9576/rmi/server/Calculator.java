package at.fhv.dlu9576.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    int calculateSquare(int value) throws RemoteException;
}