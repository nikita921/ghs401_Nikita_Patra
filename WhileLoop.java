import javax.swing.JOptionPane;


public class WhileLoop
{
  public static void main(){
   
      int ages = -1;
    
   while(ages<0 || ages>120)
   {
       String age = JOptionPane.showInputDialog("Please enter your age");
       ages = Integer.parseInt(age);
       
    }
    System.out.print("Thank you!");
}
}