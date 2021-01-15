/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import hospital.Person.*;
import java.util.ArrayList;
/**
 *
 * @author mazen
 */
public class Operation {
     private float cost;
    private String time;
    private String type;
    private String AssignedNurse;
    private String AssignedDoctor;
    private int RoomNumber;
    private String PatientName;
    private ArrayList<Doctor> Observers1 = new ArrayList<Doctor>();
    private ArrayList<Accountant> Observers2 = new ArrayList<Accountant>();
    private ArrayList<Nurse> Observers3 = new ArrayList<Nurse>();

    public Operation(float cost, String time, String type, String AssignedNurse, String AssignedDoctor, int RoomNumber, String PatientName) {
        this.cost = cost;
        this.time = time;
        this.type = type;
        this.AssignedNurse = AssignedNurse;
        this.AssignedDoctor = AssignedDoctor;
        this.RoomNumber = RoomNumber;
        this.PatientName = PatientName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAssignedNurse() {
        return AssignedNurse;
    }

    public void setAssignedNurse(String AssignedNurse) {
        this.AssignedNurse = AssignedNurse;
    }

    public String getAssignedDoctor() {
        return AssignedDoctor;
    }

    public void setAssignedDoctor(String AssignedDoctor) {
        this.AssignedDoctor = AssignedDoctor;
    }


    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

   
    
}
