import java.util.ArrayList;

public class collegeDriver1
{
    // instance variables - replace the example below with your own
    public static void main()
    {
        ArrayList<College> collegeList = new ArrayList<College>();
        College c1 = new College("UCLA");
        College c2 = new College("UCSB");
        College c3 = new College("USC");
        College c4 = new College("MIT");
        College c5 = new College("Las Po");
        //College[] college1 = {c1,c2,c3,c4,c5};
        
        collegeList.add(c1);
        collegeList.add(c2);
        collegeList.add(c3);
        collegeList.add(c4);
        collegeList.add(c5);
        for(College currcollege : collegeList)
        {
            System.out.println(currcollege.getName());
        }
        System.out.println("About to remove some colleges...");
        for(int i = 0; i <collegeList.size(); i++)
        {
            if(collegeList.get(i).getName().length() > 4) {
                collegeList.remove(i);  
                i--;
                }
        }
        for(int x=0; x < collegeList.size(); x++){
            System.out.println(collegeList.get(x).getName());
        }
        System.out.println("About to add some colleges...");
        College c6 = new College("UCB");
        College c7 = new College("Stanford");
        collegeList.add(c6);
        collegeList.add(c7);
        for(int y=0; y < collegeList.size(); y++){
            System.out.println(collegeList.get(y).getName());
        }
    }
}
