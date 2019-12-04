package prestation.composition;

public class Hotel extends Prestation {

    public Hotel(double prix) {
        super(prix);
    }

    @Override
    public double getPrix() {
        return super.getPrix();
    }
    @Override
    public void affiche(){
        System.out.println("Hotel\n");
    }
}
