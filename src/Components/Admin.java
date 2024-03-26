package Components;

public class Admin extends Employe {
    private String agence ;
    public Admin(Integer code , String nom , String prenom , String agence){
        super(code, nom,prenom);
        this.agence = agence ;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }
}
