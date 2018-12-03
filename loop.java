

public class loop
{
   public static void main(){
       int[] myArray = new int[100];
       
       for(int i=0; i<myArray.length; i++){
           myArray[i] = i*5;
           System.out.println("Item " + (i+1) + "in the array is: " + myArray[i]);
        }

    }
}
