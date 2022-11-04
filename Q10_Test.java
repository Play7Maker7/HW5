public class Q10_Test {
    public static void main(String[] args) {
        Q10 harry = new Q10("Harry , Hacker",50000);
        System.out.println("Expected: Harry , Hacker");
        System.out.println("Output:   " + harry.GetName()+"\n");
        System.out.println("Expected: 50000.0");
        System.out.println("Output:   " + harry.GetSalary()+"\n");
        harry.raiseSalary(10);
        System.out.println("Expected: 55000.0");
        System.out.println("Output:   " + harry.GetSalary()+"\n");
    }
}
