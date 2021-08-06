
package calculator;


import java.io.Serializable;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


public class CalculatorImpl extends UnicastRemoteObject implements Calculator,Serializable {
    
    @Override
    public int add(int a, int b) throws RemoteException {
        System.out.println("Client request to calculate");
        return (a + b);
    }

    
}
