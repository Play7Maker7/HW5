public class Q1_Test {
    public static void main(String[] args) {
        Q1 X=new Q1();
        X.click();
        X.click();
        System.out.println(X.Display());
        X.Undo();
        System.out.println(X.Display());
        X.reset();
        System.out.println(X.Display());
        X.Undo();
        X.Undo();
        System.out.println(X.Display());
    }
}
