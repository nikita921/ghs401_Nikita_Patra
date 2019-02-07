import java.util.ArrayList;

public class Element
{
   public static void main()
   {
       ArrayList<String> elementList = new ArrayList<String>();
       elementList.add("argon");
       elementList.add("boron");
       elementList.add("carbon");
       elementList.add("flourine");
       elementList.add("gold");
       elementList.add("iron");
       elementList.add("livermorium");
       
       System.out.println("Here are the elements..");
       for(int i=0; i<elementList.size();i++)
       {
           System.out.println(elementList.get(i));
       }
       
       System.out.println("\nThe elements containing ‘on’ are..");
       for(int x=0; x<elementList.size();x++)
       {
            if(elementList.get(x).contains("on"))
            {
                System.out.println(elementList.get(x));
            }
       }
       
       System.out.println("\nThe elements before the letter 'd'..");
       for(int y=0; y<elementList.size();y++)
       {
           if(elementList.get(y).compareTo("d") > 0)
           {
               elementList.remove(elementList.get(y));
               y--;
           }
       }
       for(int z=0; z<elementList.size();z++)
       {
            System.out.println(elementList.get(z));
       }
}
}
