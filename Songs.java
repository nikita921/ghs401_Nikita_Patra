

public class Songs
{
   private double cost;
   private String artist;
   private String title;
   private String genre;
   
   public Songs(){
       this.cost = 0;
       this.artist = null;
       this.title = null;
       this.genre = null;
       System.out.println("1");
    }
   
   public Songs(double cost, String artist, String title, String genre)
   {
       this.cost= cost;
       this.artist = artist;
       this.title = title;
       this.genre = genre;
       System.out.println("2");
   }
   
   public String toString(){
       String output = "The Price: " + this.cost + "\nThe Artist: " + this.artist + "\nThe Title: " + this.title + "\nThe Genre: " + this.genre;
       
       return output;
    }
}
