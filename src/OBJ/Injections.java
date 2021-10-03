/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJ;

import java.util.ArrayList;

/**
 *
 * @author GMT
 */
public class Injections {

    private final String injectionId;
    private final String studentId;
    private final String vaccineId;
    private ArrayList<Detail> details;

    public Injections(String injectionId, String studentId, String vaccineId, ArrayList<Detail> details) {
        this.injectionId = injectionId;
        this.details = details;
        this.studentId = studentId;
        this.vaccineId = vaccineId;
    }

    public String getInjectionID() {
        return injectionId;
    }

    public ArrayList<Detail> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<Detail> details) {
        this.details = details;
    }

    public String getStudentID() {
        return studentId;
    }

    public String getVaccineID() {
        return vaccineId;
    }


    @Override
    public String toString() {
        String str = "InjectionId: " + this.injectionId + ", Number of injection: " + this.getDetails().size() + ", StudentID: " + this.getStudentID() + ", VaccineID: " + this.getVaccineID();
        return str;
    }
    
    public String saveToFile() {
        String str = this.getInjectionID()+ ", " + this.getStudentID() + ", " + this.getVaccineID();
        ArrayList<Detail> details = this.getDetails();
        
        for (Detail detail : details) {
            if (!detail.getPlace().isEmpty()) {
                str = str + ", " + detail.getPlace() + ", " + detail.getDate();
            }
        }

        return str;
    }
}
