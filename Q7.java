public class Q7 {
    private double Balance , rate;

    public Q7 (double X , double Y)
    {
        rate=Y;
        Balance=X;
    }

    public void withDraw()
    {
        Balance=0;
    }
    public double getBalance()
    {
        return Balance;
    }

    public void addInterest()
    {
        Balance=Balance+(Balance*(rate/100));
    }
}
