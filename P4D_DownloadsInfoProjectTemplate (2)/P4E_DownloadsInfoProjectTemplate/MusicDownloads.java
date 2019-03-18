 

import java.util.List;
import java.util.ArrayList;

public class MusicDownloads
   {
   private List<DownloadInfo> downloadList;
   
   public MusicDownloads()
      {
      downloadList = new ArrayList<DownloadInfo>();
      downloadList.add( new DownloadInfo( "Hey Jude", 5 ) );
      downloadList.add( new DownloadInfo( "Soul Sister", 3 ) );
      downloadList.add( new DownloadInfo( "Aqualung", 10 ) );
      } // end constructor
      
   public DownloadInfo getDownloadInfo(String title)
      {
      for(int i = 0;i<downloadList.size();i++)
          {
          if(downloadList.get(i).getTitle().equals(title))
             {
              return downloadList.get(i);
             }
          }
      return null;
       }
      
   public void updateDownloads( List<String> titles )
      {
      for(int h = 0; h < titles.size(); h++){
         DownloadInfo r=getDownloadInfo(titles.get(h));
         if(r!=null)
            {
                r.incrementTimesDownloaded();
            }
         else
            {
                downloadList.add(new DownloadInfo(titles.get(h)));
            }
            }
      } // end method updateDownloads
      
   public String toString()
      {
      String musicDownloads = new String( "" );
      
      for( DownloadInfo item : downloadList )
         {
         musicDownloads = musicDownloads + item;    
         } // end for each
         
      return musicDownloads;
      } // end toString
   } // end class MusicDownloads