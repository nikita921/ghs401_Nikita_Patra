
public class HamburgDriver
{
    public static void main()
    {
        //make one instance(object) of the hamburger class
        Hambur hamburger1= new Hambur();
        Hambur hamburger2= new Hambur();
        
        //print the toString of the object 
        System.out.println(hamburger1.toString());
        System.out.println(hamburger2);
        
        Hambur hamburger3=new Hambur(true,3,"cheddar");
        System.out.println(hamburger3.toString());
    }
}
