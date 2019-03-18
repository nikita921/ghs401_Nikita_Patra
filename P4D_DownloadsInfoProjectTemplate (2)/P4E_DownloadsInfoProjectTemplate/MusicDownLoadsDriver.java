 

import java.util.List;
import java.util.ArrayList;

public class MusicDownLoadsDriver
   {
   public static void main(  )
      {
      MusicDownloads myDownLoads = new MusicDownloads();
      List<String> playlist = new ArrayList<String>( );
      playlist.add( "Aqualung" );
      playlist.add( "Hey Jude" );
      playlist.add( "Soul Sister" );
      playlist.add( "Lights" );
      playlist.add( "Go Now" );
      playlist.add( "Hey Jude" );
      playlist.add( "Beat It" );
      
      System.out.println( "Music Downloads:\n" + myDownLoads );  
      System.out.println( "Testing method getDownloadInfo for \"Aqualung\"\n" + myDownLoads.getDownloadInfo( "Aqualung" ) + "\n" );
      System.out.println( "Testing method getDownloadInfo for \"Too Legit\"\n" + myDownLoads.getDownloadInfo( "Too Legit" ) + "\n" );
      myDownLoads.updateDownloads( playlist );
      System.out.println( "Testing method updateDownloads: \n" + myDownLoads );
      } // end method main
   } // end class Driver