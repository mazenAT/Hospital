/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Operation;
import java.io.Serializable;

/**
 *
 * @author islam
 */




public class Nurse extends Person implements Serializable{
   
    
    private String JobDegree;
    private String Shift;
    private String OperationTime;
    private String OperationTimeType ;
    private boolean availability;

    

    public Nurse(String JobDegree, String Shift, boolean availability, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.JobDegree = JobDegree;
        this.Shift = Shift;
        this.availability = availability;
    }

    

    

    public String getDegreeLvl() {
        return JobDegree;
    }

    public void setDegreeLvl(String degreeLvl) {
        this.JobDegree = degreeLvl;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }


    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isAvailability() {
        return availability;
    }

   
    
}
