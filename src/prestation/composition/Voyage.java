package prestation.composition;

import java.util.ArrayList;

public abstract class Voyage implements IVoyage {
    private double prix;
    private int nbAdultes;
    private int nbEnfants;
    private ArrayList<Prestation> PrestationList;

    protected Voyage(double prix, int nbA, int nbE){
        this.prix = prix;
        this.nbAdultes = nbA;
        this.nbEnfants = nbE;
        this.PrestationList = new ArrayList<Prestation>();
    }

    public double getPrix() {
        int size = PrestationList.size();
        for (int value = 0; value < size;value = value +1){
            this.prix = this.prix + PrestationList.get(value).getPrix();
        }
        return prix;
    }

    public int getNbAdultes() {
        return nbAdultes;
    }

    public int getNbEnfants() {
        return nbEnfants;
    }
    protected void ajoutPrestation(Prestation prestationVoulu){
        this.PrestationList.add(prestationVoulu);
    }

    protected void affichePrestation(){
        int size = PrestationList.size();
        for (int value = 0; value < size;value = value +1){
            System.out.println("Numéro de la prestation:" + value);
            PrestationList.get(value).affiche();
        }
    }
    protected void suppressionPrestation(int indiceElemSuppr){
        this.PrestationList.remove(indiceElemSuppr);
    }
}
