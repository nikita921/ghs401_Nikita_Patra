

public class MyPhone
{
    // instance variables - replace the example below with your own
    private String color;
    private double capacity;
    private Song[] songLibrary;

    
    public MyPhone(String color,double capacity,Song[] songLibrary)
    {
        this.color = color;
        this.capacity = capacity;
        this.songLibrary = songLibrary;
        
    }

    public double getTotalPlayTime()
    {
        double total=0.0;
        
        for(int i=0; i<songLibrary.length; i++)
        {
            if(songLibrary[i] != null)
            {
                 total += songLibrary[i].getLengthInSec();
            }
        }
        
        return total;
    }
    
    public void deleteAllSongs()
    {
        for(int i=0; i<songLibrary.length; i++)
        {
            songLibrary[i] = null;
        }
    }
    
    public String getTotalPlayTimeMinSec()
    {
       int  minutes = (int) getTotalPlayTime()/60;
       int seconds = (int) getTotalPlayTime()%60;
       
       String print = "The length of all of the songs are: " + minutes + " minutes and " + seconds + " seconds";
       return print;
       
    }
    
    public String printSongs()
    {
        String titles = "";
        for(int i=0; i<songLibrary.length; i++)
        {
            if(songLibrary[i] != null){
                titles += (songLibrary[i].title + "\n");
            }
            
            else
            {
                titles+= "empty\n";
            }
        }
        return titles;
    }
    
    public String toString()
    {
        String output = "Color: " + this.color + "\nCapacity: " + this.capacity + "GB\nSong Names:\n" + printSongs(); 
        return output;
    }
}
