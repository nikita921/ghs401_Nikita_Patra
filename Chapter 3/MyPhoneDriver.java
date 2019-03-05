
public class MyPhoneDriver
{
    public static void main()
    {
        Song song1 = new Song(15,"","song1","",123);
        Song song2 = new Song(15,"","song2","",13);
        Song song3 = new Song(15,"","song3","",55);
        Song song4 = new Song(15,"","song4","",244);
        
        
        Song[] songs = {song1,song2,song3,song4}; 
        MyPhone phone1 = new MyPhone("Black", 100,songs);
        
        System.out.println(phone1.toString());
        System.out.println(phone1.getTotalPlayTime() + " seconds" + "\n" + phone1.getTotalPlayTimeMinSec());
        
        phone1.deleteAllSongs();
        
        System.out.println("\n\n" + phone1.toString());
        System.out.println(phone1.getTotalPlayTime() + " seconds" + "\n" + phone1.getTotalPlayTimeMinSec());
    }
}
