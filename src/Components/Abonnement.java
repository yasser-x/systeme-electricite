package Components;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Abonnement {
    public Admin admin ;
    public Client c ;
    public Localite l ;
    public Compteur compteur ;
    public Integer NoAbonnement ;
    public  String TypeUtilisation ;
    public LocalDate DateMiseService ;

    List<Prelevement> prelevements = new ArrayList<Prelevement>();

    public Abonnement(Client c , Localite l , Compteur compteur  ){
        this.c = c ;
        this.l = l ;
        this.compteur = compteur ;
        this.TypeUtilisation = TypeUtilisation ;
    }
    public void CreatPrelevement(LocalDate DatePrelevement , int NoPrelevement , Localite localite , Releveur releveur ){
        Prelevement prelevement = new Prelevement(DatePrelevement , localite ,NoPrelevement  , releveur , this) ;
        this.prelevements.add(prelevement) ;
    }
}
