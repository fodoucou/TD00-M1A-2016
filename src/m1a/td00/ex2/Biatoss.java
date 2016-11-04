package m1a.td00.ex2;

import java.util.Date;

/**
 * Created by fodoucou on 20/09/2016.
 */
public class Biatoss extends Personnel {
    int salaire;
    Date date;
    public Biatoss(String doucoure, String foule, int i,int sa, Date d) {
        super(doucoure,foule,i);
        this.salaire=sa;
        this.date=d;
    }
}
