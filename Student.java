// The `import` statements in Java are used to bring in external classes or packages into your code.
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * The Student class represents a student with a name and date of birth.
 */
public class Student extends StudentCourse {
    public String name;
    public String dob;

    /**
     * The function "displayName" prints the name of a student.
     */
    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    // The `displayAge` method in the `Student` class is used to calculate and display the age of a
    // student based on their date of birth (`dob`).
    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");


    }

    /**
     * The main function creates a new Student object, sets the name attribute, and then calls the
     * displayName and displayAge methods.
     */
    public static void main(String[] args) {
        Student s=new Student();
        StudentCourse s1= new StudentCourse();
        s.name = "Manali.M.Naik";
        s.displayName();
        s.displayAge("18-04-2004");
        s1.displayStudentcourses();
        s1.displayStudentMarks();
       }
}