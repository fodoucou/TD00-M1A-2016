package m1a.td00.model;

/**
 * Created by fodoucou on 20/09/2016.
 */

/**
 * classe racine des shapes en 2 dimensions
 */

public abstract class Shape2D extends Shape implements Translatable2D {


    private final Point2D refPoint;

    protected Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    public abstract double perimeter();

    public Point2D getRefPoint() {
        return refPoint;
    }

    @Override
    public String toString() {
        return "Shape2D{" +
                "refPoint=" + refPoint +
                '}';
    }
}
