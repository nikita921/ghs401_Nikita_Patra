

public class Person
{
   private String first;
   private String middle;
   private String last;
   public Person()
   {
       this.first=null;
       this.middle=null;
       this.last=null;
   }
   
   public Person(String first, String middle, String last)
   {
       this.first=first;
       this.middle=middle;
       this.last=last;
   }
   
   public String toString()
   {
       String output = "Name: " + this.first + " " + this.middle + " " + this.last;
       return output;
       
   }
}
