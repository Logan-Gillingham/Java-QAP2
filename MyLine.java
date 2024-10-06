public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return
        end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;

    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int dx = end.getX() - begin.getX();
        int dy = end.getY() - begin.getY();
        return Math.atan2(dy, dx);
    }

    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
