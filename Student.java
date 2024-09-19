package javacode;

import java.util.Date;


public class  Student extends Person {
   private float GPA;
   private String major;

    public Student(String id, String fullName, Date dayOfBith,float GPA, String major) {
        super(id, fullName, dayOfBith);
        this.GPA = GPA;
        this.major = major;
    }

    public Student(String major, String sName, String sDoB, float GPA, String major1) {
        this.GPA = GPA;
        this.major = major;
    }
    
    public Student() {
        
    }
    
    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public void displayInfo(){
        System.out.println("ID: "+ id );
        System.out.println("fullname:"+fullName);
        System.out.println("Date:"+dayOfBith);
        System.out.println("GPA: "+GPA);
        System.out.println("Major: "+major);
    }

    boolean getGpa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
