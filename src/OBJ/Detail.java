/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJ;

import OBJList.Valdation;
import java.sql.Date;

/**
 *
 * @author GMT
 */
public class Detail {

    private String place;
    private Date date;

    public Detail(String place, Date date) {
        this.place = place;
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static Detail makeDetail(int index) {
        String place = Valdation.getString("Enter the place " + (index + 1) + ": ", "Invalid", false);
        Date date = Valdation.getDate("Enter the injections time (yyyy-mm-dd): ");
        return new Detail(place, date);
    }

    @Override
    public String toString() {
        return "Place: " + this.place + ", Date:" + this.date;
    }
}
