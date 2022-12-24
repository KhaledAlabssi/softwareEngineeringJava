package fpackage;
public class Point {
    private int x;
    private int y;

    public Point(int startx, int starty) {
        x = startx;
        y = starty;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point otherP) {
        int dx = x - otherP.getX();
        int dy = y = otherP.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main(String[] args) throws Exception {

        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        System.out.println(p1.distance(p2));
        System.out.println("Hello, World!");
    }
    
}
