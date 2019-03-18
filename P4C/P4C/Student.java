 

public class Student
   {
   private String firstName;
   private String lastName;
   private int gradeLevel;
   private double[] grades;   // like saying i'm going to have an array
   private double calculatedGPA;
   
   public Student()
      {
      firstName = null;
      lastName = null;
      gradeLevel = 0;
      grades = new double[5];      // this actually creates the array called "grades"
      for( int index = 0; index < grades.length; index++ )
         {
         grades[index] = 0.0;    
         } // end for
      calculatedGPA = 0.0;
      } // end zero-argument constructor
      
   public Student( String initialFirstName, String initialLastName, int initialGradeLevel, 
                      double initialEnglish,
                      double initialMath,
                      double initialScience,
                      double initialFineArts,
                      double initialSocialScience )
      {
      firstName = initialFirstName;
      lastName = initialLastName;
      gradeLevel = initialGradeLevel;
      
      grades = new double[5];        // you have to create the array in both constructors, 
      grades[0] = initialEnglish;    // otherwise it doesn't exist in this second array anymore
      grades[1] = initialMath;
      grades[2] = initialScience;
      grades[3] = initialFineArts;
      grades[4] = initialSocialScience;
      
      } // end constructor Student
   
   public String getFirstName()
      {
      return firstName;    
      } // end method getFirstName
      
   public String getLastName()
      {
      return lastName;    
      } // end method getFirstName

   public double calcGPA()   //you are getting a double back and you don't need any additional input,
      {                      // so you put double before calcGPA and nothing in the parentheses
      double calculatedGPA = 0.0;
      
      for( int index = 0; index < grades.length; index++ )
         {
          calculatedGPA += grades[index];
         } // end for
          
      calculatedGPA /= grades.length;
      return calculatedGPA;
      } // end method calcGPA
    
   
      
   public int getGradeLevel()
      {
      return gradeLevel;    
      } // end method getGradeLevel
        
   public String toString()
      {
      String currentGrades = new String();
      for( int index = 0; index < grades.length; index++ )
         {
         // currentGrades = currentGrades + grades[index] + " ";
         currentGrades += grades[index] + " ";
         } // end for
      
      return firstName + " " + lastName + ", " +
             "Grade:" + gradeLevel + " " +
             "(" + currentGrades + ")," +
             "GPA is: " + calcGPA();
          
      } // end method toString
       
   } // end class Student