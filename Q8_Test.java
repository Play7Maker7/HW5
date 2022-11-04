public class Q8_Test {
    public static void main(String[] args) {
        Q8 X = new Q8();
        X.deposit(1000);
        System.out.println("Expected: 1000.0");
        System.out.println("Output:   " + X.getBalance()+"\n");
        X.withDraw(500);
        System.out.println("Expected: 500.0");
        System.out.println("Output:   " + X.getBalance()+"\n");
        X.withDraw(120);
        System.out.println("Expected: 380.0");
        System.out.println("Output:   " + X.getBalance()+"\n");
        X.deposit(20);
        System.out.println("Expected: 400.0");
        System.out.println("Output:   " + X.getBalance()+"\n");
        X.deposit(100);
        System.out.println("Expected: 500.0");
        System.out.println("Output:   " + X.getBalance()+"\n");
        X.deposit(500);
        System.out.println("Expected: 1000.0");
        System.out.println("Output:   " + X.getBalance()+"\n");
        System.out.println("End of the month balance: \n");
        System.out.println("Expected: 999.0");
        System.out.println("Output:   " + X.IncludeDeduction()+"\n");
    }
}