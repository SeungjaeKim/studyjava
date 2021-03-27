package chapter5.ch06;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        //형 변환을 해 줘야 한다.
        Powder p = (Powder) printer.getMaterial();

    }
}
