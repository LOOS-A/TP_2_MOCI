package prestation.composition;

public class LocationVoiture extends Prestation {

    public LocationVoiture(double prix) {
        super(prix);
    }

    @Override
    public double getPrix() {
        return super.getPrix();
    }

    @Override
    public void affiche(){
        System.out.println("Location Voiture\n");
    }
}
