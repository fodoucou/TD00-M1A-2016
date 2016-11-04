package m1a.td00.model;

/**
 * Created by fodoucou on 20/09/2016.
 */
public abstract class Shape3D extends Shape implements  Translatable3D {
    private Point3D refPoint;

    public Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }

    public abstract double volume();

    public Point3D getRefPoint(){
        return this.refPoint;
    }
}
