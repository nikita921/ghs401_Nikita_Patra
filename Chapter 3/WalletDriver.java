

public class WalletDriver
{
    public static void main()
    {
        int x=9;
        int y=2;
        double answer = x/(double)y;
        System.out.println(answer);
        
        Money m1 = new Money(1);
        Money m2 = new Money(5);
        Money m3 = new Money(10);
        Money[] cash = {m1,m2,m3};
        
        Wallet w1 = new Wallet(cash);
        
        System.out.println(w1.getAverageAmount());
    }
}
