public class Q3_Test {
    public static void main(String[] args) {
        Q3 X = new Q3();
        X.deposit(1000);
        X.withDraw(500);
        X.withDraw(400);
        System.out.println("Expected: 100.0");
        System.out.println("Output:   "+X.getBalance());
    }
}
