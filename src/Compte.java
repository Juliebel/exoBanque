package com.company;


import java.util.ArrayList;
import java.util.List;


public class Compte
{
    private String nom;
    private int numCompte;
    protected List<Compte> listeCompte;

    public Compte(){
        listeCompte= new ArrayList<>();
    }


    public String getNom() {
        return nom;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public Compte(String nom,int numCompte)
    {
        this();
        this.nom=nom;
        this.numCompte=numCompte;
    }






}
