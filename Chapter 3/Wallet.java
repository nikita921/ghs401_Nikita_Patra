

public class Wallet
{
    private Money[] mon;
    
    public Wallet(Money[] mon)
    {
        this.mon = mon;
    }
    
    public double getAverageAmount()
    {
        double count = 0;
        for(int i=0;i<mon.length;i++)
        {
            count += mon[i].getAmount();
        }
        
        return count/mon.length;
    }
}

