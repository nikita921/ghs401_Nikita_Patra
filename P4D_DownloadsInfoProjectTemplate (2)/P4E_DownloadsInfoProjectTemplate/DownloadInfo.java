 

public class DownloadInfo
   {
   private String title;  
   private int timesDownloaded;
      
   public DownloadInfo(String initialTitle)
      {
      title = initialTitle;
      timesDownloaded = 1;
      } // end zero-argument constructor
   
   public DownloadInfo( String initialTitle, int initialTimesDownloaded )
      {
      title = initialTitle;
      timesDownloaded = initialTimesDownloaded;
      } // end method DownloadInfo
      
   public String getTitle()
      {
      return title;    
      } // end method getTitle
      
   public void incrementTimesDownloaded()
      {
      timesDownloaded++;    
      } // end method incrementTimesDownloaded
   
  
      
   public String toString()
      {
      String info = new String( "" );
      info = "Title: " + title + "\n" + "Number of times downloaded: " + timesDownloaded + "\n\n";
      
      return info;
      } // end toString
   } // end class DownloadInfo