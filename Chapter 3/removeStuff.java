import java.util.ArrayList;

public class removeStuff
{
   public static void main()
   {
       String name = "Nikita";
       int age = 17;
       String[] family = {"Noah","Kalea","Sydney"};
       ArrayList<String> myList = new ArrayList<String>();
       myList.add("Noah");
       myList.add("Kalea");
       myList.add("Sydney");
       
       System.out.println(name + " is " + age);
       for(String currName : family)
       {
           System.out.println(currName);
       }
       for(String currName : myList)
       {
           System.out.println(currName);
       }
       System.out.println("-------------------------");
       
       Changer(name,age,family,myList);
       System.out.println(name + " is " + age);
       for(String currName : family)
       {
           System.out.println(currName);
       }
       for(String currName : myList)
       {
           System.out.println(currName);
       }
       System.out.println("-------------------------");
   }
   public static void Changer(String n, int a, String[] f, ArrayList<String> m)
   {
       n = "screwdriver";
       a = 100;
       
       for(int i = 0; i < f.length; i++)
       {
           f[i] = "Mickey Mouse";
       }
       
       for(int i = 0; i < m.size(); i++)
       {
           m.set(i,"Donald Duck");
       }
       
       
   }
   
   
}
