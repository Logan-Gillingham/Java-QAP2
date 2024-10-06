/*
    MyRectangle
    - topLeft: MyPoint
    - bottomRight: MyPoint

    + MyRectangle(x1, y1, x2, y2)
    + MyRectangle(topLeft, bottomRight)
    + getTopLeft(): MyPoint
    + setTopLeft(topLeft: MyPoint)
    + getBottomRight(): MyPoint
    + setBottomRight(bottomRight: MyPoint)
    + getWidth(): int
    + getHeight(): int
    + getArea(): int
    + getPerimeter(): int
    + toString(): String
 */


public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getWidth() {
        return bottomRight.getX() - topLeft.getX();
    }

    public int getHeight() {
        return bottomRight.getY() - topLeft.getY();
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
