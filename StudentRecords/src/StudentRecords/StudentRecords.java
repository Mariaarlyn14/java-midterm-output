package StudentRecords;

//Midterms
//@author Maria Arlyn R. Fuerte

import java.util.*;
import javax.swing.*;

class Student{
    //Variables
    public String FullName;
    public String   Age;
    
public Student (String FullName, String Age){
    this.FullName = FullName;
    this.Age = Age;
    }

Student() {
        FullName = "";
	Age = "";
    }
public String getFullName() {
    return FullName;
    }

public void setFullName(String FullName) {
    this.FullName = FullName;
    }

public String getAge() {
    return Age;
    }

public void setAge(String Age) {
    this.Age = Age;
    }
}
public class StudentRecords {
    
    public static void main(String[] args) {
        ArrayList <Student> StudentData = new ArrayList <Student>();
        Main_Menu(StudentData);
    }
  
    public static void Main_Menu(ArrayList <Student> StudentData){
        
        int choice = Integer.parseInt(JOptionPane.showInputDialog("                 Welcome to"
                    +"\nWest Visayas State University"
                    +"\n            Student Records"
                    +"\n     by: Maria Arlyn R. Fuerte"
                    +"\n                   (BSCS  2-A)"
                    +"\n\n1. Add New Account"
                    +"\n2. View All Account"
                    +"\n3. Delete Account"
                    +"\n4. Modify Account"
                    +"\n5. Exit"
                    +"\n\nEnter Choice: "));
        
            switch (choice){
                case 1 -> { //Add Account
                    Add_Account(StudentData);
            }
                case 2 -> {
                    //View All Account
                    View_Account(StudentData);
            }  
                case 3 -> {
                    //Delete Account
                    Delete_Account(StudentData);
            }

                case 4 -> { //Modify Account
                    Modify_Account(StudentData);
            }
                    
                case 5 -> { //Exit
                    JOptionPane.showMessageDialog(null,"Press Enter to Exit");
                    return;
            }
                
                default -> System.out.println("\nInvalid Please Try Again...");
            }
    }
    public static void Add_Account(ArrayList <Student> StudentData){
        boolean cont = true;
        while (cont) {
            JOptionPane.showMessageDialog(null,"Add New Account");
            String FullName = JOptionPane.showInputDialog("Enter Full Name(FirstName + LastName)");
            String Age = JOptionPane.showInputDialog("Enter Age:");
            
            Student Student = new Student ();
            Student.setFullName(FullName);
            Student.setAge(Age);
            StudentData.add(Student);
            
            JOptionPane.showMessageDialog(null,"Saved Sucessfully!");
            Main_Menu(StudentData);
    }
    }
    
    public static void View_Account(ArrayList <Student> StudentData){
        System.out.println("\n\n--View Account--");
        int i = 0;
        for(Student s: StudentData){
            System.out.println(i+1 + "  " + s.getFullName() + "\t" + s.getAge());
            i++;
            }
            Main_Menu(StudentData);
}
    
    public static void Delete_Account(ArrayList <Student> StudentData){
        
        System.out.println("\n\n--Delete Account--");
        int i = 0;
        for(Student s : StudentData){
            System.out.println(i+1 + "  " + s.getFullName() + "\t" + s.getAge());
            i++;
            }
            String index = JOptionPane.showInputDialog("\nEnter number to delete: ");
            int indexint = Integer.parseInt(index)-1;
            StudentData.remove(indexint);
            JOptionPane.showMessageDialog(null,"You Have Successfully Deleted your Data!");
            Main_Menu(StudentData);
        }
    
    public static void Modify_Account(ArrayList <Student> StudentData){
        System.out.println("\n\n--Modify Account--");
        int i = 0;
        for(Student s : StudentData){
            System.out.println(i+1 + "  " + s.getFullName() + "\t" + s.getAge());
            i++;
            }
        String index = JOptionPane.showInputDialog("\nEnter number to Modify: ");
        int indexint = Integer.parseInt(index)-1;
        StudentData.get(indexint).setFullName(JOptionPane.showInputDialog("Enter New Full Name"));
        StudentData.get(indexint).setAge(JOptionPane.showInputDialog("Enter New Age"));
        JOptionPane.showMessageDialog(null,"You Have Successfully Modified Your Data!");
        Main_Menu(StudentData);
    }
}