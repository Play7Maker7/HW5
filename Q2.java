public class Q2 {
    private int Y , Limit , X;

    public void setLimit(int Y)
    {
        Limit=Y;
    }
    public void click()
    {
        if (X==Limit) X=Limit;
        else X++;
    }

    public void reset() {X=0;}

    public int Display()
    {
        return X;
    }
}
