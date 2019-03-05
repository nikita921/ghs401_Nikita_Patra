import java.util.ArrayList;
import java.util.List;

public class Friends
{
   public static void main()
   {
       List<String> friendList = new ArrayList<String>();
       friendList.add("Phoebe");
       friendList.add("Chandler");
       friendList.add("Joey");
       friendList.add("Monica");
       
       for(int i = 0; i < friendList.size(); i++)
       {
           //friendList.remove(i);
           System.out.println(friendList.get(i));
       }
       
       //foreach loop - access not modify
       for(String currFriend: friendList)
       {
           System.out.println(currFriend);
       }
   }
}
