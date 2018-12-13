
public class musicAndMovies
{
    public static void main()
    {
      String[] movie = new String[3];
      movie[0] = "Legally Blonde";
      movie[1] = "13 Going on 30";
      movie[2] = "Mean Girls";
      String[] music = new String[3];
      music[0] = "Jingle Bell Rock";
      music[1] = "All I Want For Christmas";
      music[2] = "Baby It's Cold Outside";
          int x = 0;
          for (int i = 0; i < movie.length; i++)
          {
              System.out.println(movie[i]);
          }
          System.out.println("\n");
          System.out.println("\n");
          while ( x <= music.length-1)
          {
              
              if(x<music.length-1){
              System.out.print(music[x] + ", ");
              
            }
            else{
                
                System.out.print(music[x]);
          
            }
            x++;
        }
    }
}
