package chapter6.ch01;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    private class InClass{
        int iNum = 100;

        void inTest(){
            System.out.println("OutClass num = " + num);
            System.out.println("OutClass sNum = " + sNum);
            System.out.println("InClass iNum = " + iNum);
        }
    }

    public void usingClass(){
        inClass.inTest();
    }

    static class InStaticClass{

        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("OutClass sNum = " + sNum);
            System.out.println("InClass iNum = " + iNum);
        }

        static void sTest(){
            System.out.println("OutClass sNum = " + sNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
       /* OutClass outClass = new OutClass();
        outClass.usingClass();*/
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        OutClass.InStaticClass.sTest();
    }
}
