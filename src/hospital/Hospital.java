/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;


import hospital.Person.DeleteUser;
import hospital.Person.Doctor;
import hospital.Person.Person;
import hospital.Person.PersonInterface;
import hospital.Person.Reception;
import hospital.Person.ReceptionistManager;
import hospital.Person.UpdateUser;
import hospital.Tranactions.Bill;
import java.rmi.RemoteException;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import hospital.Tranactions.BillReadOnly;

/**
 *
 * @author mazen
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       try {
            // Connecting to the RMI Registry created on the server
            Registry R = LocateRegistry.getRegistry(1010);

            // Search for the stub "calc"
            BillReadOnly b;
           b = (BillReadOnly)R.lookup("bill");

            // Invoke the remote methods on the remote object
//            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//            ArrayList<Bill> Bills = b.AllBills();
//            Object rowData[] = new Object[0];
//            
//            for (int i = 0; i < Bills.size();i++) {
//                
//                rowData[0] = Bills.get(i).getBillID();
//                rowData[1] = Bills.get(i).getPateintName();
//                rowData[2] = Bills.get(i).getBillDetails();
//                rowData[3] = Bills.get(i).getTotalMoney();
//                
//            }
        } catch (Exception ex) {
            System.out.println("Exception occured");
        }
       
    }
    
}
