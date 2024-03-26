package Components;

public class Employe {
    protected Integer code ;
    protected String nom ;
    protected String prenom ;

    public Employe(Integer code, String nom, String prenom) {
        this.code = code ;
        this.nom = nom ;
        this.prenom = prenom ;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
