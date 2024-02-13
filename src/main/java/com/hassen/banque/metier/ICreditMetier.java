package com.hassen.banque.metier;

public interface ICreditMetier {
    public double calculMensualite(double capital, double taux, int duree);
}
