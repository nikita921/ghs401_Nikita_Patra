public class LogMessageDriver
   {
   public static void main()
      {
      LogMessage message = new LogMessage( "Webserver:disk offline" );
      System.out.println( message );
      System.out.println( message.getMachineID() );
      System.out.println( message.getDescription() );
      
      System.out.println( "\n" );
     
      LogMessage message1 = new LogMessage( "Web:disk" );
      LogMessage message2 = new LogMessage( "Computer:error on disk" );
      LogMessage message3 = new LogMessage( "printer:error on /dev/disk disk" );
      LogMessage message4 = new LogMessage( "desktop:error on disk DSK1" );
      
      LogMessage message5 = new LogMessage( "Webserver:DISK" );
      LogMessage message6 = new LogMessage( "server:error on disk3" );
      LogMessage message7 = new LogMessage( "schoolServer:error on /dev/disk" );
      LogMessage message8 = new LogMessage( "lab:diskette" );
      
      
      System.out.println( message1.containsWord("disk") );
      System.out.println( message2.containsWord("disk") );
      System.out.println( message3.containsWord("disk") );
      System.out.println( message4.containsWord("disk") );
      
      System.out.println();
      
      System.out.println( message5.containsWord("disk") );
      System.out.println( message6.containsWord("disk") );
      System.out.println( message7.containsWord("disk") );
      System.out.println( message8.containsWord("disk") );
      } // end method main
 
       
   } // end class LogMessageDriver
