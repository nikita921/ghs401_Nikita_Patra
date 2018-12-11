

public class array
{
    public static void main(){
        int[] myArray = new int[20];
        System.out.println("The length of the array is " + myArray.length);
        myArray[0] = 55;
        myArray[1] = 17;
        myArray[3] = 100;
        myArray[myArray.length-2] = 3;
        myArray[11] = 73;
        
        for(int i=0; i<myArray.length; i++) {
            
            System.out.println("The value of element: " + i + " in the array is " + myArray[i]);
        }
    }
}
