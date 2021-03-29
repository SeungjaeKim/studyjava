package chapter6.ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1, s2);

        StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
        concat.makeString(s1, s2);

        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s11, String s21) {
                System.out.println(s11 + ", " + s21);
            }
        };

        concat2.makeString(s1, s2);
    }
}
