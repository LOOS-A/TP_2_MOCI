package prestation.composition;

import java.util.Scanner;

public class MainPresta {

    private static void ajoutPrestation(Voyage v1){
        System.out.println("Voulez vous ajouter des prestations ?\n");
        System.out.println("1: Oui");
        System.out.println("2: Non");
        Scanner sc = new Scanner(System.in);
        int choixPrestation = sc.nextInt();
        switch (choixPrestation) {
            case 1:
                System.out.println("Quel type de prestation voulez vous ?\n1: Hotel\n2: Excursion\n3: Location de voiture\n");
                Scanner sc1 = new Scanner(System.in);
                int choixPrestationAjout = sc1.nextInt();
                switch (choixPrestationAjout) {
                    case 1:
                        int prixInitHotel = 130;
                        Hotel h1 = new Hotel(prixInitHotel);
                        v1.ajoutPrestation(h1);
                        ajoutPrestation(v1);
                        break;
                    case 2:
                        int prixInitExcursion = 80;
                        Excursion Exc1 = new Excursion(prixInitExcursion);
                        v1.ajoutPrestation(Exc1);
                        ajoutPrestation(v1);
                        break;
                    case 3:
                        int prixInitLocationVoiture = 35;
                        LocationVoiture Loc1 = new LocationVoiture(prixInitLocationVoiture);
                        v1.ajoutPrestation(Loc1);
                        ajoutPrestation(v1);
                        break;
                }
                break;
            case 2:
                break;
        }
    }

    private static void supprimerPrestation(Voyage v1){
        System.out.println("Voulez vous supprimer des prestations ?\n");
        System.out.println("1: Oui");
        System.out.println("2: Non");
        Scanner sc = new Scanner(System.in);
        int choixPrestation = sc.nextInt();
        switch (choixPrestation){
            case 1:
                System.out.println("Affichage des prestations présentes dans le voyage:\n");
                v1.affichePrestation();
                Scanner scan = new Scanner(System.in);
                System.out.println("Choisissez le numéro de la prestation que vous voulez supprimer:\n");
                int choixPrestationSuppr = scan.nextInt();
                v1.suppressionPrestation(choixPrestationSuppr);
                supprimerPrestation(v1);
                break;
            case 2:
                break;
        }
    }

    private static void affichePrix(Voyage v1){
        System.out.println("Prix de votre voyage:\n");
        double prix = v1.getPrix();
        System.out.println(prix + "\n");
    }

    public static void main(String args[]){
        System.out.println("1. Ajouter un Voyage\n");
        System.out.println("2. Quitter\n");

        Scanner sc = new Scanner(System.in);
        int choixDeBase = sc.nextInt();
        switch (choixDeBase)
        {
            case 1:
                System.out.println("Quelle type de pension voulez-vous ?:\n");
                System.out.println("1: Demi-Pension\n");
                System.out.println("2: Pension-Complète\n");
                Scanner sc1 = new Scanner(System.in);
                int choixPension = sc1.nextInt();

                switch (choixPension)
                {
                    case 1:
                        System.out.println("Indiquer le nombre d'adultes participant au voyage:\n");
                        Scanner sc2 = new Scanner(System.in);
                        int nbA = sc.nextInt();
                        System.out.println("Indiquer le nombre d'enfants participant au voyage:\n");
                        Scanner sc3 = new Scanner(System.in);
                        int nbE = sc.nextInt();
                        double prixInit = 0;
                        VoyageAvecDP v1 = new VoyageAvecDP(prixInit,nbA,nbE);
                        System.out.println("Ajout de prestation\n");
                        ajoutPrestation(v1);
                        supprimerPrestation(v1);
                        affichePrix(v1);
                        break;
                    case 2:
                        System.out.println("Indiquer le nombre d'adultes participant au voyage:\n");
                        Scanner sc4 = new Scanner(System.in);
                        int nbA2 = sc.nextInt();
                        System.out.println("Indiquer le nombre d'enfants participant au voyage:\n");
                        Scanner sc5 = new Scanner(System.in);
                        int nbE2 = sc.nextInt();
                        double prixInit2 = 0;
                        VoyageAvecPC v2 = new VoyageAvecPC(prixInit2,nbA2,nbE2);
                        System.out.println("Ajout de prestation\n");
                        ajoutPrestation(v2);
                        supprimerPrestation(v2);
                        affichePrix(v2);
                        break;
                }
            case 2:
                break;
        }
    }

}