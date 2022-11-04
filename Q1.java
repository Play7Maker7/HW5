public class Q1 {
    private int X=0;

    public void click()
    {
        X++;
    }

    public void reset()
    {
        X=0;
    }

    public int Display()
    {
        return X;
    }

    public void Undo(){
        if (X==0) X=0;
        else X--;
    }
}
