package inheritance.point;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double distance(int Ax, int Ay) {
        return Math.sqrt((x - Ax) * (x - Ax) + (y - Ay) * (y - Ay));
    }

    public double distance(Point pt) {
        return Math.sqrt((x - pt.x) * (x - pt.x) + (y - pt.y) * (y - pt.y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
