import javax.swing.JOptionPane;

public class whereismj
{
    public static void main(){
       String school = JOptionPane.showInputDialog("Please enter your school: ");
       if (!school.equals("Granada")){
           System.out.println("Incorrect school");
            
        }
        else {
            String mascot = JOptionPane.showInputDialog("What is your mascot?");
            
            
            
            if (mascot.equals("Matadors")) {
            

                System.out.println("Access granted");
                String[] artists = new String[4];
                artists[0] = null;
                artists[1] = "Joji";
                artists[2] = "Michael Jackson";
                artists[3] = "Mozart";
                int i = 0;
                for (i=0; i< artists.length;i++){
                       String blob = artists[i];
                      
                       if(artists[i]==(null)){
                        System.out.println("Element " + i + " is empty");
                    }
                    else{   
                    if(blob.equals("Michael Jackson")){
                        System.out.println("We Found him. Element " + i + " is Michael Jackson");
                       }
                       else{
                         System.out.println("We did not find him. Element "+i+" is " +artists[i] );
                       
                     }
                    }
                    

                }
            String favartist = JOptionPane.showInputDialog("What is your favorite artist?");
            if (favartist.equals("Michael Jackson"))
            {
                System.out.println("We have the same taste in music!");
            }
            else{
              
               System.out.println("We do not have the same favorite artist. So bye!"); 
            }
            
            
            
        }
        else {
            System.out.println("Incorrect mascot");
        }
        
    }
}
}
