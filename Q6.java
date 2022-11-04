public class Q6 {

    private double Balance , rate;

    public Q6 ()
    {
        Balance=0;
        rate=0;
    }
    public Q6 (double X , double Y)
    {
        rate=Y;
        Balance=X+(X*Y/100);
    }

    public void deposit(double X)
    {
        Balance=Balance+X;
    }
    public void withDraw(double X)
    {
        if (Balance>=X) Balance-=X;
        else System.out.println("Not Enough Balance.");
    }
    public double getBalance()
    {
        return Balance;
    }

    public void addInterest(double rate)
    {
        Balance=Balance+(Balance*(rate/100));
    }
}

