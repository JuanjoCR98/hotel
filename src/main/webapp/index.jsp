<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel</title>
    </head>
    <body>
        <h1>RESERVA HOTEL</h1>
        <form action="servletReserva">
            <p>Fecha de entrada <input type="date" name="fechaentrada"></p>
            <p>Fecha de salida <input type="date" name="fechasalida"></p>
            <p>Tipo habitación
                <select name="habitacion">
                    <option value="normal">Normal</option>
                    <option value="superior">Superior</option>
                </select>
            </p>
            <p><input type="submit" value="Reservar"></p>
        </form>
    </body>
</html>
