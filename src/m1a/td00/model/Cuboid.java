package m1a.td00.model;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class Cuboid extends Shape3D{
    private double length;
    private double width;
    private double heigth;

    public Cuboid(Point3D p,double length, double width, double heigth) {
        super(p);
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    public double volume(){
        return 0.0d;
    }

    public double surface(){
        return 0.0d;
    }
}
