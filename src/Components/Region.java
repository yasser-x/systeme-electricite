package Components;

import java.util.List;

public class Region {
    protected Integer Code  ;
    protected String Nom ;
    protected Directeur directeur ;

    protected List<Localite> localites ;

    public Directeur getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Directeur directeur) {
        this.directeur = directeur;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public List<Localite> getLocalites() {
        return localites;
    }

    public void setLocalites(List<Localite> localites) {
        this.localites = localites;
    }
}
