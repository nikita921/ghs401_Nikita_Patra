import java.util.ArrayList;
public class ClassRoster
   {
   private String courseName;
   private ArrayList<Student> student;
   public ClassRoster(String courseName)
   {
       this.courseName = courseName;
       student = new ArrayList<Student>();
       
       student.add(new Student( "Super", "Man", 12, 1, 1, 1, 1, 1 ));
       student.add(new Student( "Silver", "Surfer", 11, 2, 2, 2, 2, 2  ));
       student.add(new Student( "Captain", "America", 12, 3, 3, 3, 3, 3  ));
       student.add(new Student( "Bat", "Man", 11, 4, 4, 4, 4, 4  ));
       student.add(new Student( "Black", "Panther", 11, 5, 5, 5, 5, 5  ));
   } // end zero-arg constructor
      
   public String studentWithMaxGPA()
   {
      int x = 0;
      Student s = student.get(x);
      for(int i=0; i<student.size(); i++)
      {
          while(student.get(i).calcGPA() > s.calcGPA())
          {
              s = student.get(i); 
          }
      }
      
      return s.getLastName();
   } // end method studentWithMaxGPA 
       
   public int dropStudent( int minGPA )
      {
      int x=0;
          for(int i=0; i<student.size(); i++)
      {
          if(student.get(i).calcGPA()<minGPA)
          {
              student.remove(student.get(i));
              x++;
              i--;
          }
      }
      return x;
      } // end method dropStudent
      
   public void addStudent( Student newStudent )
      {
        
            student.add(newStudent);
        
      } // end method addStudent
     
      
   public void addStudent(int index, Student newStudent)
      {
        
            student.add(index, newStudent);
        
      } // end method addStudent
      
   public String toString()
      {
      String output = new String();
      output += "Class: " + courseName + "\n";
       
      for( int index = 0; index < student.size(); index++ )
      {
         output += student.get( index ) + "\n";  
      } // end for
      return output;
      } // end method toString
   } // end ClassRoster