package com.hassen.banque.metier;

public class TestMetier {
    public static void main(String[] args) {
        ICreditMetier metier = new CreditMetierImpl();

        double taux=4.5;
        int duree=240;
        double capital=200000;
        double m = metier.calculMensualite(capital,taux,duree);
        System.out.println(m);
    }
}
