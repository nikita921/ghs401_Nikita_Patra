import java.util.ArrayList;

public class SuperheroDriver
{
    public static void main()
    {
        ArrayList<Superhero> myList = new ArrayList<Superhero>();
        Superman s1 = new Superman("Superman", true, "blue"); 
        Batman s2 = new Batman("Batman", true, "bat");         
        Hulk s3 = new Hulk("The Hulk", false,"large");
        myList.add(s1);
        myList.add(s2);
        myList.add(s3);
        
        System.out.print(s1.getMotto() + "\n");
        for(int i = 0; i < myList.size(); i++)
        {
            //System.out.print(myList.get(i).getMotto() + "\n");
        }
        
        for(Superhero currSuper : myList)
        {
            System.out.println("\n" + currSuper.toString());
        }
        
        System.out.println(s2.hasCar());
    }
}
