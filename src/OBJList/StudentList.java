/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJList;

import java.util.ArrayList;
import OBJ.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.StringTokenizer;
/**
 *
 * @author GMT
 */
public class StudentList extends ArrayList<Student>{

    public StudentList(int i) {
        super(i);
    }

    public StudentList() {
    }
    
    public StudentList(Collection<? extends Student> clctn) {
        super(clctn);
    }
    
    public Student findStudentID(String ID){
        for(Student stu: this){
            if(stu.getStudentId()== null?ID ==null:stu.getStudentId().equals(ID)){
                return stu;
            }
        }
        return  null;
    }
    
    public boolean loadFromFile(String fileName) throws FileNotFoundException, IOException {
        File f = new File(fileName);
        if (!f.exists()) return false;
	FileReader fr = new FileReader(f);
	BufferedReader bf = new BufferedReader(fr);
	String details;
        while ((details = bf.readLine()) != null) {
				StringTokenizer stk = new StringTokenizer(details);
				String studentID = stk.nextToken(",").trim();
                                String name = stk.nextToken(",").trim();
				Student e = new Student(studentID, name);
				this.add(e);
			}
        return true;
    }
    
    public boolean saveToFile(String fileName) throws FileNotFoundException, IOException {
		File f = new File(fileName);
		if (!f.exists()) return false;
		try (PrintWriter out = new PrintWriter(f)) {
			this.forEach(item -> out.println(item.toString()));
		}
		return true;
    }
    public String chooseStudent() {
        Menu menu = new Menu(this.size());
        for (int i = 0; i < this.size(); i++) {
            menu.add(this.get(i).getName());
        }
        
        int choice;
        do {
            System.out.println("Enter number to choose students");
            System.out.println("0 - Exit");
            choice = menu.getChoice();
        } while (choice < 0 && choice > this.size());
        
        if (choice != 0){
            return this.get(choice - 1).getStudentId();
        }
        
        return null;
    }
}
