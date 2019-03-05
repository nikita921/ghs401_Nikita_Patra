import java.util.ArrayList;

public class Digit
{
   private ArrayList<Integer> digitList;
   
   public Digit(int num)
   {
       digitList = new ArrayList<Integer>();
       String numS = num + "";
       for(int i = 0; i < numS.length(); i++)
       {
           String c = numS.substring(i,i+1);
           digitList.add(Integer.parseInt(c));
       }
       
       /*digitList = new ArrayList<Integer>();
       if(num==0)
       {
           digitList.add(0);
       }
       while(num>0)
       {
           digitList.add(num%10);
           num/=10;
       }*/
   }
   
   public boolean isStrictlyIncreasing()
   {
       for(int i = 0; i < digitList.size()-1; i++)
       {
           if(digitList.get(i) >= digitList.get(i+1))
           {
               return false;
           }
       }
       return true;
   }
   
   public String toString()
   {
       String output = "";
       for(Integer currentInt:digitList)
       {
           output+=currentInt;
       }
       return output;
   }
}
