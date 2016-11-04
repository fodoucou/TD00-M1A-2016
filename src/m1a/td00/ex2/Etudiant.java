package m1a.td00.ex2;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class Etudiant extends Personnel {
    boolean bourse;

    public Etudiant(String d,String e,int sec,boolean bourse) {
        super(d,e,sec);
        this.bourse = bourse;
    }
}
