import java.util.ArrayList;
public class FoodDriver
{
    public static void main()
    {
        Burger b1  = new Burger(true,false,true);
        Pi p1 = new Pi(true,false,"Apple");
        Biriyani b2 = new Biriyani(true,true,"Veg");
        Food[] myFood = {b1,p1,b2};
        
        Food[] myfood = {new Burger(true,false,true), new Pi(true,false,"Apple"), new Biriyani(true,true,"Veg")};
        ArrayList<Food> notMyFood= new ArrayList<Food>();
        notMyFood.add(b1);
        notMyFood.add(p1);
        notMyFood.add(b2);
       
        for(Food currFood: myFood)
        {
            System.out.print("\n" + currFood.toString() + "\n" + currFood.isEaten() + "\n");
        }
        
        System.out.println("\n");
        
        for(Food currFood: notMyFood)
        {
            System.out.print("\n" + currFood.toString() + "\n" + currFood.isEaten() + "\n");
        }
        //System.out.println(b2.isSpicy()); 
    }
}
