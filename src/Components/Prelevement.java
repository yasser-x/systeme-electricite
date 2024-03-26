package Components;

import java.time.LocalDate;


public class Prelevement {
    private Releveur releveur ;
    private LocalDate datePrelevement;
    private Localite localite;
    private int noPrelevement;
    private Abonnement abonnement;

    public Prelevement(LocalDate datePrelevement, Localite localite, int noPrelevement , Releveur releveur , Abonnement abonnement) {
        this.datePrelevement = datePrelevement;
        this.localite = localite;
        this.noPrelevement = noPrelevement;
        this.releveur = releveur ;
        this.abonnement = abonnement  ;
    }

    public LocalDate getDatePrelevement() {
        return datePrelevement;
    }

    public void setDatePrelevement(LocalDate datePrelevement) {
        this.datePrelevement = datePrelevement;
    }

    public Localite getLocalite() {
        return localite;
    }

    public void setIndex(Localite localite) {
        this.localite = localite;
    }

    public int getNoPrelevement() {
        return noPrelevement;
    }

    public void setNoPrelevement(int noPrelevement) {
        this.noPrelevement = noPrelevement;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public Releveur getReleveur() {
        return releveur;
    }

    public void setReleveur(Releveur releveur) {
        this.releveur = releveur;
    }
}

