

public class Driver
{
    public static void main()
    {
        
        Songs song8= new Songs();
        Songs song2= new Songs(0.50, "Imagine Dragons", "Radioactive", "Pop");
        
        Student student1= new Student();
        Songs song1= new Songs();
        Student student2= new Student("Daria", "Orlova", 17, "female");
        
        System.out.println(song1.toString() + "\n \n" + song2.toString() + "\n \n" + student1.toString() 
        + "\n \n" + student2.toString());

    }
}
