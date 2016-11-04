package m1a.td00.ex2;

/**
 * Created by fodoucou on 20/09/2016.
 */
public abstract class Personnel {
    String nom;
    String prenom;
    int secu;


    public Personnel(String d, String e, int sec) {
        this.nom=d;
        this.prenom=e;
        this.secu=sec;
    }
}
