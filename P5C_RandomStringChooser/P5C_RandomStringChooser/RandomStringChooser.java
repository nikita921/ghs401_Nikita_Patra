 import java.util.ArrayList;

public class RandomStringChooser
{
   private ArrayList<String> wordList1;
   
   public RandomStringChooser(String[] wordList)
   {
       this.wordList1 = new ArrayList<String>();
       for(int i = 0; i < wordList.length; i++)
           {
               this.wordList1.add(wordList[i]);
           }
       
   }
   
   public String getNext()
   {
       
       String s = ""; 
       if(wordList1.size()>0)
       {
           int x = (int)(Math.random()*wordList1.size());
           s = wordList1.get(x);
           wordList1.remove(wordList1.get(x));
       }
       else
       {
           return "NONE";
       }
       return(s);
   }
   
   public String toString()
   {
      String output = new String();
      
      for( String word : wordList1 )
      {
         output += word + ", ";    
      } // end for
         
      return output;
   } // end method toString
} // end RandomStringChooser