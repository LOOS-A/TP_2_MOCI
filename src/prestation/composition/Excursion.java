package prestation.composition;

public class Excursion extends Prestation {

    public Excursion(double prix) {
        super(prix);
    }

    @Override
    public double getPrix() {
        return super.getPrix();
    }

    @Override
    public void affiche(){
        System.out.println("Excursion\n");
    }
}
