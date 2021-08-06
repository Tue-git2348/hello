/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;


public class CalculatorServer {

    public static void main(String[] args) throws AlreadyBoundException {
        try {
//tao doi tuong CalculatorImpl
            CalculatorImpl cal = new CalculatorImpl();
            System.out.println("Exporting Calculator ! ");
//thong bao su hien dien của cal la doi tuong co kha nang remote cho JVM
//            UnicastRemoteObject.exportObject(cal); // ???
//dang ky doi tuong voi trinh quan ly rmi
            Naming.rebind("rmi://localhost/cal", cal);
            System.out.println("Register Calculator!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
