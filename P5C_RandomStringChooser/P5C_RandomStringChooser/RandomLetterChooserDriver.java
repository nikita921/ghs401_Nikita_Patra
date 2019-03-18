 

public class RandomLetterChooserDriver
   {
   public static void main(  )
      {
      RandomLetterChooser letterChooser = new RandomLetterChooser( "cat" );
      
      for( int k = 0; k < 4; k++ )
         {
         System.out.println( letterChooser.getNext() );    
         } // end for
         
      } // end method main
       
   } // end class RandomLetterChooserDriver