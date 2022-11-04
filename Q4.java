public class Q4 {
    private double Balance , rate;

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
