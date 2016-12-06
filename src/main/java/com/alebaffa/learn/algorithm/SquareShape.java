/**
 * Created by abaffa on 30/11/2016.
 */
public class SquareShape {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int distance(Point p1, Point p2) {
        return (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
    }

    public static boolean checkSquare(Point p1, Point p2, Point p3, Point p4) {
        boolean result = false;

        int p1p2 = distance(p1, p2);
        int p1p4 = distance(p1, p4);
        int p1p3 = distance(p1, p3);

        if (p1p2 == p1p4) {
            if (p1p3 == p1p2 * 2)
                return true;
        }

        return result;
    }

    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 10);
        Point p3 = new Point(20, 20);
        Point p4 = new Point(10, 20);

        System.out.println(checkSquare(p1, p2, p3, p4));
    }
}
