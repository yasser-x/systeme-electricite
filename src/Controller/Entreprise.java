package Controller;



import Components.*;

import java.util.*;

public class Entreprise {
    Map<Integer , Client> clients = new HashMap<Integer , Client>() ;
    Map<Integer , Region> regions = new HashMap<Integer , Region>() ;
    Map<Integer , Compteur> compteurs = new HashMap<Integer , Compteur>() ;
    Map<Client , List<Abonnement>> abonnements= new HashMap<Client , List<Abonnement>>() ;

    public Client indiquerClient (int noClient ){
        if(this.clients.containsKey(noClient)) return this.clients.get(noClient) ;

        throw new RuntimeException("Client Introuvable !!");
    }

    public Localite indiquerLocalite( int NoRegion , int NoLocalite ) {
        Region r ;
        if (this.regions.containsKey(NoRegion)) {
            r=regions.get(NoRegion) ;
            if (r.getLocalites().contains(NoLocalite)) return r.getLocalites().get(NoLocalite);
        }
        throw new RuntimeException("Localité Intreouvable !!") ;
    }

    public Compteur indiquerCompteur(int NoCompteur ) {
        if (this.compteurs.containsKey(NoCompteur)) return this.compteurs.get(NoCompteur) ;

        throw new RuntimeException("Compteur non entegistré !! ") ;
    }


    public void validerAbonnement(Integer NoCompteur ,Integer NoLocalite ,Integer NoClient ){
        Client clt ;
        Localite lct ;
        Compteur cmpt ;
        clt = indiquerClient(NoClient ) ;
        lct = indiquerLocalite(NoLocalite) ;
        cmpt = indiquerCompteur(NoCompteur) ;
        Abonnement abonnement = new Abonnement(clt ,lct , cmpt ) ;
        List<Abonnement> abs = this.abonnements.get(clt) ;
        this.abonnements.put(clt , abs) ;

    }

    public List<Region> getListRegion (){
        List<Region> list = (List<Region>) regions.values() ;
        return list ;
    }


}
