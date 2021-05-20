package chapter6.ch08;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseableObj obj = new AutoCloseableObj();

        try(obj) {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception");
        }

        System.out.println("end");
    }
}
