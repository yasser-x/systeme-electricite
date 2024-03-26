package Components;

import java.util.Date;

public class Directeur extends Employe{

    private Date DateDeNomination ;
    public Directeur(Integer code , String nom , String prenom , Date DateDeNomination){
        super(code, nom,prenom);
        this.DateDeNomination = DateDeNomination ;
    }

    public Date getDateDeNomination() {
        return DateDeNomination;
    }

    public void setDateDeNomination(Date dateDeNomination) {
        DateDeNomination = dateDeNomination;
    }
}
