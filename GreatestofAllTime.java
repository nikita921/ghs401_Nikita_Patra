import javax.swing.JOptionPane;

public class GreatestofAllTime
{
    public static void main(){
        int response = Integer.parseInt(JOptionPane.showInputDialog("How many?"));
        
        while(response<10 || response>100){
             
            response = Integer.parseInt(JOptionPane.showInputDialog("That's crazy! Try again"));
        
        }
        int[] myArray = new int[response];
        for (int i=0; i < response; i++)
        {
            int x  = (int)(Math.random()*(91)+10);
            myArray[i] = x;
            System.out.print(myArray[i] +" ");
        }
        
        int max = myArray[0];
        for(int i = 0; i < response; i++)
        {
            if(max < myArray[i])
            {
                max = myArray[i];
            }
            else if (max > myArray[i])
            {
                max = max;
            }
            else
            {
                max = max;
            }
        }
        int min = myArray[0];
        for(int i = 0; i < response; i++)
        {
            if(min < myArray[i])
            {
                min = min;
            }
            else if (min > myArray[i])
            {
                min = myArray[i];
            }
            else
            {
                min = min;
            }
        }
        System.out.println("\nGreatest: " + max);
        System.out.println("Lowest: " + min);
       
    }
}    
