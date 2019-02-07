

public class Jukebox1
{
    public static void main()
    {
        String[] songList1 = {"Jump","Respect",null,"Apologize","September",null,null};
        
        String[] songList2 = {"Magic Carpet Ride","Respect","Life is a Highway","Apologiza","September","Respect","Under Pressure"};;
        
        String[] myPlaylist = new String[7];
        
        for(int i=0;i<myPlaylist.length; i++)
        {
                if (songList1[i]!=null && songList2[i]!=null){
                    if (songList2[i].compareTo(songList1[i])>0){
                        myPlaylist[i]=songList1[i];
                    }
                    else if (songList2[i].compareTo(songList1[i])<0)
                    {
                        myPlaylist[i]=songList2[i];
                    }
                    else
                    {
                        myPlaylist[i]=songList1[i];
                        System.out.println("The songs are identical");
                }
            }else{
                if (songList1[i]==null){
                    myPlaylist[i]=songList2[i];
                }else{
                    myPlaylist[i]=songList1[i];
                }
            }
        }
        
        System.out.printf("%-5s %25s %25s %25s %25s","Index","List one","List two","list 3","\n");
        for(int i=0;i<myPlaylist.length; i++)
        {
            System.out.printf("%-5s %25s %25s %25s %25s",i,songList1[i],songList2[i],myPlaylist[i],"\n");
        }
        
    }
}
