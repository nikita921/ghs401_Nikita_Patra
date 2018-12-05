import javax.swing.JOptionPane;

public class HiLow
{
    public static void main() {
       String high = JOptionPane.showInputDialog("Please insert a high value: ");
       String low = JOptionPane.showInputDialog("Please insert a low value: ");
       int h = 0;
       int n = 0;
       int highInt = Integer.parseInt(high);
       int lowInt = Integer.parseInt(low);
       if (lowInt >= highInt){
           System.out.println("error");
        }
        else {
           int[] myArray = new int[10];
           for (int i=0; i<myArray.length; i++) {
               myArray[i] =(int)(Math.random()*((highInt+1)-lowInt)+lowInt);
               
               System.out.println("The array is: " + myArray[i]);
               int remainder = myArray[i]%2;

               if (remainder == 0) {
                   System.out.println("This number is even ");
                   h++;
            }
                else {
                    System.out.println("This number is odd ");
                    
                    
            
            
            } 

        

        }
    }
            
        System.out.println("There are " + h + " even numbers");
            
        System.out.println("There are " + (10-h) + " odd numbers");


}
}
