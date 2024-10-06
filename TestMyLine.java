public class TestMyLine {
    public static void main(String[] args) {
        
        MyLine line = new MyLine(1, 2, 3, 4);

        System.out.println("Line length: " + line.getLength());
        System.out.println("Line gradient: " + line.getGradient());
        System.out.println("Line string representation: " + line);

        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine line2 = new MyLine(p1, p2);

        System.out.println("Line 2 length: " + line2.getLength());
        System.out.println("Line 2 gradient: " + line2.getGradient());
        System.out.println("Line 2 string representation: " + line2);
    }
}