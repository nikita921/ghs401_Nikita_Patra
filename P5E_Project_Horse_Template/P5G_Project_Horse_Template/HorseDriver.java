 

public class HorseDriver
   {
   public static void main()
      {
      HorseBarn home = new HorseBarn();
      
      System.out.print( home  + "\n" );
      
      String horseName = "Lady"; 
      System.out.println( horseName + " can be found in stall [" + home.findHorseSpace( horseName ) + "]\n" );
      
      String horseName1 = "Patches"; 
      System.out.println( horseName1 + " can be found in stall [" + home.findHorseSpace( horseName1 ) + "]\n" );
      
      
      home.consolidate();
      System.out.print( home + "\n" );
      } // end method main
   } // end class HorseDriver