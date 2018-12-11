import javax.swing.JOptionPane;

public class FibSequence
{
  public static void main() {
    

          
          
          String numfib = JOptionPane.showInputDialog("How many numbers would you like to see?");
          int numFib = Integer.parseInt(numfib);
          int[] numbersArray = new int[numFib];

          
          int[] runningArray = new int[numFib];
          
          int[] numbers = new int[numFib];

          System.out.println("Index \t Fib Num. \t Running Total");
          
          for(int i=0; i<numbers.length; i++) {
              numbers[i] = i+1;
    
                
            }
          
            
          numbersArray[0] = 0;
          numbersArray[1] = 1;


          for(int i=2; i<numbers.length; i++) {
              numbersArray[i] = (numbersArray[i-1]) + (numbersArray[i-2]);
            }
            
          
          
          for(int i=0; i<numbers.length; i++) {
              
              if(i==0) {
                  numbers[i] = 1;
                  runningArray[i] = 0;
                  numbersArray[i] = 0;
                  System.out.println(numbers[i] + ("\t") + numbersArray[i] + ("\t") + ("\t") + runningArray[i]);
            }
            else{
            
              runningArray[i] = (numbersArray[i]) + (runningArray[i-1]);
             
             System.out.println(numbers[i] + ("\t") + numbersArray[i] + ("\t") + ("\t") + runningArray[i]);
    
                
            }
            
    
    
          
          //int [] fibonacci = new int[numFib];
          
          //for(int i=0; i<fibonacci.length; i++) {
              //c3 = (c1+c2);
              //c1 = c2;
              //c2 = c3;
             // System.out.println(("\t") + c3);
              
    
            }

        }
    }

