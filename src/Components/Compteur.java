package Components;

import java.util.Date ;
public class Compteur {
    protected int Id , TensionDeSortie , PuissanceMax , Taxe ;

    protected  Date MiseEnService ;

    public Compteur(int Id , int TensiondeSortie , int PuissanceMax , int Taxe ){
        this.Id = Id ;
        this.TensionDeSortie = TensiondeSortie ;
        this.PuissanceMax = PuissanceMax ;
        this.Taxe = Taxe ;

    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getTensionDeSortie() {
        return TensionDeSortie;
    }

    public void setTensionDeSortie(int tensionDeSortie) {
        TensionDeSortie = tensionDeSortie;
    }

    public int getPuissanceMax() {
        return PuissanceMax;
    }

    public void setPuissanceMax(int puissanceMax) {
        PuissanceMax = puissanceMax;
    }

    public int getTaxe() {
        return Taxe;
    }

    public void setTaxe(int taxe) {
        Taxe = taxe;
    }

    public Date getMiseEnService() {
        return MiseEnService;
    }

    public void setMiseEnService(Date miseEnService) {
        MiseEnService = miseEnService;
    }

}
