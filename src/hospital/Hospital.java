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

import hospital.Tranactions.OperationInterface;
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

       
        try{
        Registry registry = LocateRegistry.getRegistry(1010);
        
        PersonInterface p = (PersonInterface) registry.lookup("per");
                    // Search for the stub "calc"
            BillReadOnly b;
           b = (BillReadOnly)R.lookup("bill");
        
        //Doctor m = new Doctor("Neurologist","Neuro-dept","day",null,"Mohamed","mohamed@mohamed.com","01000214546",30,"Male","helwan","Doctor",12500);
        //p.RegisterP(m);
        
        
      //  p.GetP(m);
      
       // System.out.print(m.toString());
      System.out.print("Client Is Ready");
        }catch(Exception ex){
            System.out.print(ex);
        }
        /*Reception R =new Reception();
        R.setVisible(true);*/
       
    }
    
}
