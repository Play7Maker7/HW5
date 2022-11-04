public class Q3 {
    private double Balance;
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
}
