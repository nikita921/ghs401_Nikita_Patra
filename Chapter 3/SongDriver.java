

public class SongDriver
{
   public static void main(){
       Song song1 =  new Song(25.55, "Kai Nelson", "Weirdo", "Country", 300);
       System.out.println(song1.getLengthInSec());
       
       song1.setLengthInSec(343);
       System.out.println(song1.getLengthInSec()); 
       System.out.println(song1.toString()); 
    }
}
