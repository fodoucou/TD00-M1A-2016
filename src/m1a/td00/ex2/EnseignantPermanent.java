package m1a.td00.ex2;

import java.util.Date;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class EnseignantPermanent extends Enseignant {
    String domaine;

    public EnseignantPermanent(String d, String e, int sec, Date date, int salaire, String domaine) {
        super(d, e, sec, date, salaire);
        this.domaine = domaine;
    }
}
