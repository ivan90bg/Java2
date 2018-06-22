package course;

public class Course {

private String name;
private int numberOfClasses;

    public Course() {
        this.name = "ime";
        this.numberOfClasses = 0;
    }

    public Course(String name, int numberOfClasses) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }


    
}
