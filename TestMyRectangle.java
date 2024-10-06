public class TestMyRectangle {
    public static void main(String[] args) {

        MyRectangle rectangle = new MyRectangle(1, 2, 5, 4);

        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle height: " + rectangle.getHeight());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle string representation: " + rectangle);

        MyPoint p1 = new MyPoint(10, 20);
        MyPoint p2 = new MyPoint(30, 40);
        MyRectangle rectangle2 = new MyRectangle(p1, p2);

        System.out.println("Rectangle 2 width: " + rectangle2.getWidth());
        System.out.println("Rectangle 2 height: " + rectangle2.getHeight());
        System.out.println("Rectangle 2 area: " + rectangle2.getArea());
        System.out.println("Rectangle 2 perimeter: " + rectangle2.getPerimeter());
        System.out.println("Rectangle 2 string representation: " + rectangle2);
    }
}