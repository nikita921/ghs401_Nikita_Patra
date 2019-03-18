public class SystemLogDriver
   {
   public static void main()
      {
      SystemLog log1 = new SystemLog();
      
      System.out.println( "Printing Removed Items:" );
      System.out.println( log1.removeMessages( "disk" ) );
      
      System.out.println( );
      System.out.println( "Printing Remaining Items:" );
      System.out.println( log1 );
          
      } // end method main
 
       
   } // end class LogMessageDriver

