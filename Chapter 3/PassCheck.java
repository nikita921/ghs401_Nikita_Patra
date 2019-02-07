import javax.swing.JOptionPane;

public class PassCheck
{
    public static void main()
    {
        String school = new String("granada");
        String mascot = new String("matadors");
        String state = new String ("california"); // note to self: the first letter should be CAps
        boolean passwordIsLong = false;
        
        String school1 = JOptionPane.showInputDialog("What school?");
        String schoolLower = school1.toLowerCase();
        if (schoolLower.equals(school))
        {
           System.out.println("Correct!"); 
           String mascot1 = JOptionPane.showInputDialog("What mascot?");
           String mascotLower = mascot1.toLowerCase();
           
           if(mascotLower.compareTo(mascot) == 0)
               {
                System.out.println("Correct!"); 
                String state1 = JOptionPane.showInputDialog("Where do you live?");
                String stateLower = state1.toLowerCase();
                
                if (stateLower.compareTo(state) == 0)
                {
                    System.out.println("Correct!");
                    String password = JOptionPane.showInputDialog("Create a new password.");
                    while(passwordIsLong == false){
                        if(password.contains("*") || password.contains("-") || password.contains("+") || password.contains("@") && password.length() >= 6)
                        {
                            System.out.println("Cool thxs.");  
                            passwordIsLong=true;
                        }
                        else
                        {                    
                            password = JOptionPane.showInputDialog("Create a new password");              
                        }
                    }
                }
                else if(stateLower.compareTo(state) > 0 )
                {
                    System.out.println("Too late in the alphabet"); 
                }
                else
                {
                    System.out.println("Too early in the alphabet");
                }
               }
               else
               {
                   System.out.println("That is the WRONG mascot.");
               } 
        }
        else
              {
                   System.out.println("You are NOT a Granada student");
              }  
        
                                                                                                                                                                                         
    }
}
