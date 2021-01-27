<%-- 
    Document   : muestraResultado
    Created on : 27-ene-2021, 12:38:29
    Author     : Juanjo Cortés
--%>

<%@page import="modelo.Calcular"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel</title>
    </head>
    <body>
        <h1>Reserva hotel</h1>
       <% 
        Calcular cal = (Calcular) request.getAttribute("calcular");
        double coste = cal.costeTotal();
       %>
        <p><b>Fecha entrada: </b>${calcular.fecha_entrada}</p>
        <p><b>Fecha salida: </b>${calcular.fecha_salida}</p>
        <p><b>Tipo de habitación: </b>${calcular.tipo_habitacion}</p>
        <p><b>Coste: </b><%=coste%>€</p>
    </body>
</html>
