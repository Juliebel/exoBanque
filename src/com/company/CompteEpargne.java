



package com.company;

public class CompteEpargne extends com.company.Compte
{
    double tauxInteret;
    double soldeCompte;
    static final double minVersement=10;



    public double getTauxInteret() {
        return tauxInteret;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public static double getMinVersement() {
        return minVersement;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public void calculInteret()
    {

    }

    public void retrait (double montant)
    {
        double nouveauSolde=0;
        if((soldeCompte-montant)<0)
        {
            System.out.println("Retrait impossible");
        }
        if(soldeCompte-montant<minVersement)
        {
            System.out.println("Fermeture du compte");
            listeCompte.remove(this);
        }

        soldeCompte=soldeCompte-montant;


    };




}
