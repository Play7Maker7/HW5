public class Q7_Test {
    public static void main(String[] args) {
        Q7 X = new Q7(1000, 10);
        System.out.println("Expected: 1000.0");
        System.out.println("Output:   " + X.getBalance());
        System.out.println("\n\n");
        X.addInterest();
        System.out.println("Expected: 1100.0");
        System.out.println("Output:   " + X.getBalance());
        System.out.println("\n\n");
        X.withDraw();
        System.out.println("Expected: 0.0");
        System.out.println("Output:   " + X.getBalance());
    }
}