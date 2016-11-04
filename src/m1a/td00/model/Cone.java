package m1a.td00.model;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class Cone extends Shape3D {

    private double height;
    private double radius;
    public Cone(Point3D p,double v, double v1) {
        super(p);
        this.height=v;
        this.radius=v1;
    }

    public double volume(){
    return 0.0d;
    }

    public double surface(){
        return 0.0d;
    }

}
