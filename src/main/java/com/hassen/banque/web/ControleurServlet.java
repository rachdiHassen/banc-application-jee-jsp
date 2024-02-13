package com.hassen.banque.web;


import com.hassen.banque.metier.CreditMetierImpl;
import com.hassen.banque.metier.ICreditMetier;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "cs", urlPatterns ={"/hassen","*.do"} )
public class ControleurServlet extends HttpServlet {
    ICreditMetier metier;
    @Override
    public void init() throws ServletException {
        metier=new CreditMetierImpl();

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("creditModele", new CreditModel());
        req.getRequestDispatcher("VueCredit.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double montant=Double.parseDouble(req.getParameter("montant"));
        double taux=Double.parseDouble(req.getParameter("taux"));
        int duree=Integer.parseInt(req.getParameter("duree"));

        CreditModel modele = new CreditModel();
        modele.setMontant(montant);
        modele.setTaux(taux);
        modele.setDuree(duree);

        double res=metier.calculMensualite(montant, taux,duree);

        modele.setMensualite(res);

        req.setAttribute("creditModele",modele);
        req.getRequestDispatcher("VueCredit.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
    }
}
