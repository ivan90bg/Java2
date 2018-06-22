package main;

import student.Student;

public class Main {

    
    public static void main(String[] args) {
        
    Student marko = new Student();
    marko.setFirstName("Igor");
    marko.setLastName("Markovic");
    marko.setYearOfBirth(1987);
    marko.getCourse().setName("engleski");
    marko.getCourse().setNumberOfClasses(88);
    marko.getComputer().setProcessTact(2.7);
    marko.getComputer().setMemory(22.5);
    marko.getComputer().setHardDrive(100);
    marko.info();
        
        
        
        
        
    }
    
}
