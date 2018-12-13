import javax.swing.JOptionPane;

public class SquareRange
{
   public static void main () {
   
       for (int i=0; i<=10; i++) {
           int number = i;
           int numberSquared = number*number;
           int random = (int)(Math.random()*(numberSquared-number+1)+number);
          if (random == number)
          {
           System.out.println(number + "\t" + numberSquared + "\t" + random + "\t The random value is equal to the index");
          }
          else if (random == numberSquared)
          {
           System.out.println(number + "\t" + numberSquared + "\t" + random + "\t The random value is equal to the square of the index");
          }
          else
          {
           System.out.println(number + "\t" + numberSquared + "\t" + random);
          }
        }
    }
}
