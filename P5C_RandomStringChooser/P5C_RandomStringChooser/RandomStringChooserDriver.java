 

public class RandomStringChooserDriver
   {
   public static void main(  )
      {
      String[] wordArray = { "wheels", "on", "the", "bus" };
      RandomStringChooser sChooser = new RandomStringChooser( wordArray );
            
      for( int k = 0;k < 6; k++ )
         {
         System.out.print( sChooser.getNext() + " " );    
         } // end for
          
      } // end method main   
       
   } // end class RandomStringChooserDriver