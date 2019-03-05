import java.util.ArrayList;

public class Family
{
    // instance variables - replace the example below with your own
    private ArrayList<Relative> fam;   
    
    public Family()
    {
        fam = new ArrayList<Relative>();
        fam.add(new Relative(18, "Noah"));
        fam.add(new Relative(17, "Ashley"));
    }
    
    public ArrayList sortByAge()
    {
        int x = 0;
        
        //Relative r = fam.get(x);
        
        //ArrayList<Relative> myList = new ArrayList<Relative>();
        for(int i = 0; i < fam.size(); i++)
        {
            for(int j = 0; j<fam.size()-1; j++)
            {
                if(fam.get(i).getAge() > fam.get(j).getAge())
                {
                    Relative r = fam.get(i);
                    fam.remove(fam.get(i));
                    r = fam.get(j);
                    //fam.get(i) = fam.get(j);
                    
                   //Relative t = fam.get(j);
                   //fam.remove(fam.get(j));
                    
                   //fam.add(i, t);
                    
                   fam.add(j, r);
                    i--;
                    j--;
                }
            }
            
            
            /*while(fam.get(i).getAge() > r.getAge())
            {
                myList.add(i, r);
                fam.remove(fam.get(i));
                myList.add(x, fam.get(i));
                x++;
            }*/
        }
        //myList = fam;
        
        return fam;
    }

    
}
