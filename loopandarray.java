

public class loopandarray
{
  public static void main(){
      String[] names = new String[4];
      names[0] = "Nikita";
      names[1] = "Ipshita";
      names[2] = "Sankar";
      names[3] = "Gita";
      
      int[] ages = {16,21,45,42};
      
      for(int i=0; i<names.length; i++) {
      System.out.println ("I am " + names[i] + " and I am " + ages[i] + " years old");
     
}
}
}
