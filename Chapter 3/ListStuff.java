import java.util.ArrayList;

public class ListStuff
{
   public static void main()
   {
       ArrayList<String> myList = new ArrayList<String>();
       myList.add("Nikita");
       myList.add("Noah");
       myList.add("Kalea");
       myList.add(1,"nick");
       
       myList.set(3,"David");
       myList.remove("Kalea");
       
       for(int i=0; i<myList.size();i++)
       {
           System.out.println(myList.get(i));
       }
   }
}
