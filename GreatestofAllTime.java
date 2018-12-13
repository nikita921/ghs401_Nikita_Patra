import javax.swing.JOptionPane;

public class GreatestofAllTime
{
    public static void main(){
        int response = Integer.parseInt(JOptionPane.showInputDialog("How many?"));
        
        while(response<10 || response>20){
             
            response = Integer.parseInt(JOptionPane.showInputDialog("That's crazy! Try again"));
        
        }
        int[] myArray = new int[response];
        for (int i=0; i < response; i++)
        {
            int x  = (int)(Math.random()*(response + 1));
            myArray[i] = x;
            System.out.print(myArray[i] +" ");
        }
        int left = myArray[0];
        int right = myArray.length-1;
       

    }
}    
