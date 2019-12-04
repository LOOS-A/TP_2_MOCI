package prestation.composition;

public abstract class Prestation {
    private double prix;

    public Prestation(double prix){
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void affiche(){
        System.out.println("");
    }
}
