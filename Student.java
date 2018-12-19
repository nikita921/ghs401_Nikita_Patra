
public class Student
{
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
        
    public Student()
    {
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
        this.gender = null;
    }
    
    public Student(String firstName, String lastName, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    
    public String toString()
    {
        String output = "First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: "
        + this.age + "\nGender: " + this.gender;
        
        return output;
    }
}
