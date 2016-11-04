package m1a.td00.model;

/**
 * Created by fodoucou on 20/09/2016.
 */

/**
 * modelise les points en 2 dim
 */
public class Point2D {
    private double x;
    private double y;

    public Point2D(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public void translate(double ax,double ay){

    }

    public boolean isOrigin(){
        return false;

    }

    public double distance(Point2D other){
        return 0.0d;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
