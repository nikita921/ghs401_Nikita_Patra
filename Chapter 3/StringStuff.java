import javax.swing.JOptionPane;
public class StringStuff
{
    public static void main()
    {
        String word1 = JOptionPane.showInputDialog("Please enter an animal:");
        
        if(word1.contains("f"))
        {
            System.out.println("The word has an f");
        }
        
        else
        {
            System.out.println("The word has no f's");
        }
        
        System.out.println(word1.toLowerCase());
        
        boolean validLength = false;
        
        while(!validLength)
        {
            String answer = JOptionPane.showInputDialog("Four letter word or longer");
            
            if(answer.length()> 3)
            {
                validLength=true;
            }
            
            // validLength = (answer.length()>3);
            // would replace if statement
        }
    }
}
