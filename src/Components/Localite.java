package Components;

import Components.Client;

import java.util.List;

public class Localite {
    protected String Nom ;
    protected Integer Id  ;
    protected List<Client> clients ;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
