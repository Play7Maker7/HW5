public class Q10 {

    private String Name;

    private double Salary;

    public Q10 (String EmployeeName , double CurrentSalary)
    {
        Name=EmployeeName;
        Salary=CurrentSalary;
    }

    public String GetName()
    {
        return Name;
    }

    public double GetSalary()
    {
        return Salary;
    }

    public void raiseSalary(double byPercent)
    {
        Salary+=Salary*(byPercent/100);
    }
}