package chapter3.ch14;

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    /**
     * Java 8 버전 이후에만 사용 가능
     */
    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        //mymethod();
    }

    /**
     * Java 8 버전 이후에만 사용 가능
     */
    static int total(int[] arr){
        int total = 0;
        for(int num : arr){
            total += num;
        }
        //myStaticMethod();
        return total;
    }

    /**
     * Java 9 버전 이후에만 사용 가능
     */
    /*private void mymethod(){
        System.out.println("myMethod");
    }

    private static void myStaticMethod(){
        System.out.println("myStaticMethod");
    }*/
}
