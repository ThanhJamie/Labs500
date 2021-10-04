/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import OBJList.Menu;
import OBJList.InjectionList;
import OBJList.VaccineList;
import OBJList.StudentList;
import OBJ.Injections;
import OBJList.Valdation;
import java.io.IOException;

/**
 *
 * @author GMT
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Menu menu = new Menu(7);
        StudentList students = new StudentList();
        InjectionList injections = new InjectionList();
        VaccineList vaccines = new VaccineList();
        Injections e = null;
        System.out.println("============================================");
        menu.add("Show infomation all students have injected");
        menu.add("Add student's vaccine injection information");
        menu.add("Updating information of students' vaccine injection");
        menu.add("Delete student vaccine injection information");
        menu.add("Search for injection information by studentID");
        menu.add("Save to file");
        menu.add("Quit");
        
        if (!vaccines.loadFromFile("vaccine.dat")) {
            System.err.println("Load Vaccines file failed");
        } else {
            System.err.println("Load Vaccines file successfull");
        }
        if (!students.loadFromFile("student.dat")) {
            System.err.println("Load Students file failed");
        } else {
            System.err.println("Load Students file successfull");
        }
        if (!injections.loadFromFile("injection.dat")) {
            System.err.println("Load Injections file failed");
        } else {
            System.err.println("Load Injections file successfull");
        }
        int choice;
        do {
            System.out.println("Welcome to Injections Management - @ 2021 by Dang Chi Thanh");
            
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    injections.printAllInjections(students, vaccines);
                    break;
                case 2:
                    injections.addInjection(students, vaccines);
                    break;
                case 3:
                    injections.updateInjections(Valdation.getString("Enter Injection Id to update: ", "Invalid", false));
                    break;
                case 4:
                    injections.deleteInjection();
                    break;
                case 5:
                    e = injections.searchInjectionByStudentID(Valdation.getString("Enter Student Id to find: ", "Invalid", false));
                    if (e != null) {
                        System.out.println(e.toString());
                    } else {
                        System.err.println("Not found!");
                    }
                    break;
                case 6:
                    if (!injections.saveToFile("injection.txt")) {
                        System.out.println("Save Injections file failed");
                    }
                    break;
                case 7:
                    break;
            }
        } while (choice != 7);

    }

}
