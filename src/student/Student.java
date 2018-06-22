package student;

import computer.Computer;
import course.Course;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

    public Student() {
        this.firstName = "ime";
        this.lastName = "prezime";
        this.yearOfBirth = 0;
        this.course = new Course();
        this.computer = new Computer();
    }

    public Student(String firstName, String lastName, int yearOfBirth, Course course, Computer computer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.course = course;
        this.computer = computer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Course getCourse() {
        return course;
    }

    public Computer getComputer() {
        return computer;
    }

    public void info() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Course name: " + getCourse().getName());
        System.out.println("Course number of classes: " + getCourse().getNumberOfClasses());
        System.out.println("Process tact: " + getComputer().getProcessTact());
        System.out.println("Memory: " + getComputer().getMemory());
        System.out.println("Hard drive: " + getComputer().getHardDrive());

    }

}
