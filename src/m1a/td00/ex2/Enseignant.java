package m1a.td00.ex2;

import java.util.Date;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class Enseignant extends Personnel {
    Date date;
    int salaire;

    public Enseignant(String d, String e, int sec, Date date, int salaire) {
        super(d, e, sec);
        this.date = date;
        this.salaire = salaire;
    }
}
