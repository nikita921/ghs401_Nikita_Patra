import javax.swing.JOptionPane;

public class review
{
   public static void main (){
       int percent = Integer.parseInt(JOptionPane.showInputDialog("What percent do you have"));
       
       while(percent<0 || percent>100){
           percent++;
           percent=Integer.parseInt(JOptionPane.showInputDialog("That's crazy! Try again"));
       
       }
       if (percent<60) {
           System.out.println("You are a failure");
           
        }
       else if (percent<70) {
           System.out.println("You have a D. Do better");
           
        }
       else if (percent<80) {
           System.out.println("You have a C! You're passing");
        }
       else if (percent<90) {
           System.out.println("You have a B! Atta kid!");
            
        }
       else {
           System.out.println("You have an A! You are officially better than everyone else!");
        }
    }
}
       
