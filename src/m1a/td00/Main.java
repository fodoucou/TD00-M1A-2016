package m1a.td00;

import m1a.td00.ex2.*;
import m1a.td00.model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape= new Rectangle(new Point2D(2,5),7,2);
        System.out.println(shape);
        Shape3D sch= new Sphere(new Point3D(5.2d,5.2d,5.2d),2.2d);
        Shape3D o= new Cuboid(new Point3D(5.2d,5.2d,5.2d),6.3d,8.9d,4.6d);
        Shape3D l=new Cone(new Point3D(5.2d,5.2d,5.2d),4.2d,1.1d);
        Rectangle rect=new Square(new Point2D(5.2d,6.3d), 2.1d,9.0d);
        Etudiant etu=new Etudiant("doucoure","foule",0123,true);
        Etudiant doct=new Doctorant("doucoure","foule",0123,true);
        EnseignantPermanent perm= new Professeur("e","r",0,new Date(2016),1000,"Java");
        EnseignantPermanent mc=new MaitreConferences("e","r",0,new Date(2016),1000,"Java");
        Enseignant n=new EnseignantTemporaire("doucoure","foule",0123,new Date(2012),3);
        EnseignantTemporaire p= new Ater("doucoure","foule",0123,new Date(2012),3);
        Personnel bi=new Biatoss("doucoure","foule",0123,new Date(2012),3);
        Biatoss bo=new Bibliothecaire("doucoure","foule",0123,new Date(2012),3);
        Biatoss sec=new Secretaire("doucoure","foule",0123,new Date(2012),3);
    }
}
