 

public class HorseBarn
   {
   private Horse[] spaces;
   
   public HorseBarn()
      {
      spaces = new Horse[7];
      spaces[0] = new RaceHorse( "Trigger", 1340 );
      spaces[1] = null;
      spaces[2] = new RaceHorse( "Silver", 1210 );
      spaces[3] = null;
      spaces[4] = null;
      spaces[5] = new RaceHorse( "Patches", 1350 );
      spaces[6] = new RaceHorse( "Duke", 1410 );
      } // end zero-arg constructor HorseBarn()
        
        
   public int findHorseSpace( String name )
      {
          for(int i = 0; i < spaces.length; i++)
          {
              if(spaces[i]!=null && spaces[i].equals(name))
              {
                  return i;
              }
          }
          return -1;
      } // end method findHorseSpace
      
   public void consolidate()
      {
          Horse[] tempSpaces = new Horse[spaces.length];
          int x = 0;
          for(int k = 0; k<spaces.length; k++)
          {
              if(spaces[k]!=null)
              {
                  tempSpaces[x] = spaces[k];
                  x++;
              }
          }
          spaces=tempSpaces;
      } // end method consolidate
      
   public String toString()
      {
      String results = new String();
      for( int index = 0; index < spaces.length; index++ )
         {
         results += spaces[index] + "\n";     
         } // end for
      return results;
      }
      
      
   } // end class HorseBarn