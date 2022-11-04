public class Q4_Test {
    public static void main(String[] args) {
        Q4 X = new Q4();
        X.deposit(1000);
        X.addInterest(10);
        System.out.println("Expected: 1100.0");
        System.out.println("Output:   "+X.getBalance());
    }
}
