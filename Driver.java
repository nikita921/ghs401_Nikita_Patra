import javax.swing.JOptionPane;

public class Driver
{
    public static void main()
    {
      double w = Double.parseDouble(JOptionPane.showInputDialog("Please enter your weight in pounds: "));
      double f = Double.parseDouble(JOptionPane.showInputDialog("For height, first enter feet"));
      double i = Double.parseDouble(JOptionPane.showInputDialog("Now enter inches"));
      String g = JOptionPane.showInputDialog("Are you a female or male?");
      String g1 = g.toLowerCase();
      double a = Double.parseDouble(JOptionPane.showInputDialog("Please enter your age in years"));
      
      BMI b1 = new BMI(w,f,i,g1,a);
      
      System.out.println(b1.toString());
      System.out.println("Basal metabolic rate is the number of calories\nyou need just for your body to function"  +
      "\n\nTo maintain your weight, consume the amount of calories calculated in your BMR." 
      + "\nIn order lose weight, consume less calories, and to gain weight, consume more.");
      
    }
}
