package m1a.td00.model;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class Sphere extends Shape3D {

    private double radius;

    public Sphere(Point3D p,double v) {
        super(p);
        this.radius=v;
    }

    public double volume(){
        return 0.0d;
    }

    public double surface(){
        return 0.0d;
    }
}
