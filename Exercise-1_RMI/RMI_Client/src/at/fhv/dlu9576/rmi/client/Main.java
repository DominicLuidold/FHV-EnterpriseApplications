package at.fhv.dlu9576.rmi.client;

import at.fhv.dlu9576.rmi.server.Calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Client is ready. Exit with '-1'!");

        Scanner scanner = new Scanner(System.in);
        int value;

        while ((value = scanner.nextInt()) != -1) {
            try {
                Calculator calculator = (Calculator) Naming.lookup("Calculator");
                System.out.println(calculator.calculateSquare(value));
            } catch (NotBoundException | MalformedURLException | RemoteException e) {
                System.out.println("Client exited with exception: " + e.getMessage());
            }
        }
    }
}
