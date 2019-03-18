

public class LogMessage
   {
   private String machineID;
   private String description;
   
   public LogMessage( String message )
      {
          
          int thing = message.indexOf(":");
          machineID = message.substring(0,thing);
          description = message.substring(thing+1);
          // to be completed in part a        
          
       
      } // end one-arg constructor
      
   public boolean containsWord( String keyword )
   {
          /*if(getDescription().contains(keyword) && getDescription().substring(0,keyword.length()).compareTo(keyword) == 0 && getDescription().contains(" " + keyword) && 
          getDescription().substring(getDescription().length()-keyword.length(),getDescription().length()).equals(keyword) && getDescription().contains(keyword + " "))
          {
              return true;
          }*/
          
          if(getDescription().contains(" " + keyword + " "))
          {
             
              return true;
          }
          else if(description.substring(0,keyword.length()).compareTo(keyword + " ") == 0)
          {
              return true;
          }
          else if(description.length()==(keyword.length()) && description.equals(keyword))
          {
              return true;
          }
          //else if(getDescription().contains(" " + keyword))
          //{
            //  return true;
          //}
          else if((description.length()>keyword.length()) && getDescription().substring((description.length()-(keyword.length()+1))).equals(" " + keyword))
          {
              return true;
          }
          //else if(getDescription().contains(keyword + " "))
          //{
              //return true;
          //}
          
          // to be completed in part b
          
          
          return false;
          
          

    
   } // end method containsWord
      
   public String getMachineID()
      {
      return machineID;    
      } // end method getMachineID
      
   public String getDescription()
      {
      return description;    
      } // end method getDescription
    
      
   


   public String toString()
      {
         return machineID + ":" + description;
      } // end method toString
    }
