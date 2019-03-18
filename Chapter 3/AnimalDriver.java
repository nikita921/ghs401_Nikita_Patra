

public class AnimalDriver
{
    public static void main()
    {
        Animal a1 = new Snake();
        Snake a2 = new Snake(9,true,true);
        Elephant a3 = new Elephant();
        Elephant a4 = new Elephant(4,true,true);
        Cobra a5 = new Cobra();
        Cobra a6 = new Cobra(12,false,true,true);
        
        Animal[] animals = {a1,a2,a3,a4,a5,a6};
        
        for (Animal data : animals)
        {
            System.out.print(data.toString());
        }
        
        System.out.println(a1.toString()+ "\n");
        System.out.println(a2.toString() + "\n" + a2.slither()+ "\n");
        System.out.println(a3.toString() + "\n");
        System.out.println(a4.toString() + "\n" + a3.snort());
    }
}
