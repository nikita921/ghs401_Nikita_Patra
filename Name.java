import javax.swing.JOptionPane;

public class Name
{
    public static void main(){
        int namelength = 0;
        int namelength1 = 0;
        String[] name = new String[3];
        String[] name1 = new String[3];
        
        String first = JOptionPane.showInputDialog("What is your first name?");
        String middle = JOptionPane.showInputDialog("What is your middle name?");
        String last = JOptionPane.showInputDialog("What is your last name?");
        
        name[0] = first;
        name[1] = middle;
        name[2] = last;
        
        String first1 = JOptionPane.showInputDialog("What is your friend's first name?");
        String middle1 = JOptionPane.showInputDialog("What is your friend's middle name?");
        String last1 = JOptionPane.showInputDialog("What is your friend's last name?");
        
        name1[0] = first1;
        name1[1] = middle1;
        name1[2] = last1;
        
        
        for( int i=0; i<name.length; i++)
        {
            namelength = namelength + name[i].length();
            
            namelength1 = namelength1 + name1[i].length();
           
        }
        if(namelength > namelength1)
        {
            System.out.println("You have a longer name");
        }
        else if(namelength1>namelength)
        {
            System.out.println("Your friend has a longer name");
        }
        else
        {
            System.out.println("It's a tie");
        }
        
        Person person1=new Person(first,middle,last);
        Person person2=new Person(first1,middle1,last1);
        
        System.out.println("Your " + person1.toString() + "\nFriend's " + person2.toString());
    }
}

