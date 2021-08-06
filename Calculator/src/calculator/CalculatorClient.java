/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;


import java.rmi.*;

public class CalculatorClient {

    public static void main(String[] args) {
        try {
            System.out.println("Finding Object ... ");
// tim doi tuong tu xa theo ten dang ky
            Calculator cal = (Calculator) Naming.lookup("rmi://localhost/cal");
// trieu goi phuong thuc tu xa
            System.out.println(cal.add(10, 20));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
