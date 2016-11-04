package m1a.td00.model;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class Rectangle extends Shape2D {

    private double longueur;
    private double largeur;

    public Rectangle(Point2D refPoint, double i, double i1) {
        super(refPoint);
        this.longueur= i;
        this.largeur=i1;
    }

    public double perimeter(){
        return 2*(longueur*largeur);
    }

    public double surface(){
        return longueur*largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{\n" +
                super.toString()+
                "\nlongeur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
