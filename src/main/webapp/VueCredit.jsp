<%@ page import="com.hassen.banque.web.CreditModel" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
   CreditModel model = (CreditModel)request.getAttribute("creditModele");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Crédit bancaire</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div>
        <form action="calculMensualite.do" method="post">
            <table>
                <tr>
                    <td><label>Montant</label></td>
                    <td><input type="text" name="montant" value=<%=model.getMontant() %>></td>
                    <td>DH</td>
                </tr>
                <tr>
                    <td>Taux</td>
                    <td><input type="text" name="taux" value=<%=model.getTaux() %>></td>
                    <td>%</td>
                </tr>
                <tr>
                    <td>Duree</td>
                    <td><input type="text" name="duree" value=<%=model.getDuree() %>></td>
                    <td>mois</td>
                </tr>
            </table>
            <button type="submit"> Calculer</button>
        </form>
    </div>
    <div>
        Mensualite = <%= model.getMensualite() %>
    </div>



</body>
</html>