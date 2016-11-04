package m1a.td00.model;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class Point3D extends Point2D{
    private double z;

    public Point3D(double x,double y,double z) {
        super(x,y);
        this.z = z;
    }

    public void translate (double x,double y){


    }

    public boolean isOrigin(){
        return false;
    }

    public double distance(Point3D p){
        return 0.0d;
    }
}
