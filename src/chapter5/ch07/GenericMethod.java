package chapter5.ch07;

public class GenericMethod {
    public static <T, V> double makeRectangle(Point<T,V>p1, Point<T,V> p2){
        double left = (double) p1.getX();
        double right = (double) p2.getX();
        double top = (double) p1.getY();
        double bottom = (double) p2.getY();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {

        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double size = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
        System.out.println(size);

    }
}
