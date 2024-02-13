package com.hassen.banque.metier;

import org.junit.Before;
import org.junit.Test;

public class TestCalculMensualite {
    ICreditMetier metier;
    @Before
    public void setUp()  {
        metier= new CreditMetierImpl();
    }

    @Test
    public void testCalculerMensualite() {
        double capital=200000;
        int duree=240;
        double taux=4.5;

        double resultAttendu=1265.2987;
        double resultCalcul=metier.calculMensualite(capital, taux, duree);
        // assertEquals(resultAttendu, resultCalcul, 0.00001);

    }
}
