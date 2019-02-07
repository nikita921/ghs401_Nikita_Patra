


public class Song
{
   private double cost;
   private String artist;
   private String title;
   private String genre;
   private int lengthInSecs;
   int minutes = 0;
   int seconds = 0;
   String print = null;
   
   public Song(double cost, String artist, String title, String genre, int lengthInSecs)
   {
       this.cost= cost;
       this.artist = artist;
       this.title = title;
       this.genre = genre;
       this.lengthInSecs = lengthInSecs;
   }
   public int getLengthInSec(){
       return lengthInSecs;
    }
   public void setLengthInSec(int newSeconds){
       lengthInSecs = newSeconds;
       
       
    }
    public String convertToMinSec(){
        minutes = lengthInSecs/60;
        seconds = lengthInSecs%60;
        
        
        print = "The length of the song is: " + minutes + " minutes and " + seconds + " seconds";
        return print;
    }
   public String toString()
   {
       String output = "The Price: " + this.cost + "\nThe Artist: " + this.artist + "\nThe Title: " + this.title + "\nThe Genre: " + this.genre + "\nLength: " + convertToMinSec();
       
       return output;
   }
   
   /*public String convertToMinSec()
   {
       
   }*/
}
