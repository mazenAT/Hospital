/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import hospital.Person.Doctor;
import hospital.Person.Person;
import hospital.Person.PersonInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

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
        Registry registry = LocateRegistry.getRegistry(1099);
        
        PersonInterface p = (PersonInterface) registry.lookup("person");
        
        Person m = new Doctor("Neurologist","Neuro-dept","day",null,null,"Mohamed","mohamed@mohamed.com","01000214546",30,"Male","helwan","Doctor",12500);
        p.RegisterP(m);
        p.GetP(m);
        System.out.print(p.toString());
        }catch(Exception ex){
            System.out.print("Exception Occured");
        }
    }
    
}
