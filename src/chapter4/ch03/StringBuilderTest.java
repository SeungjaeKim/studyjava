package chapter4.ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder builder = new StringBuilder(java);
        System.out.println(System.identityHashCode(builder));
        builder.append(android);
        System.out.println(System.identityHashCode(builder));

        String test = builder.toString();
        System.out.println(test);
    }


}
