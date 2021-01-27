/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAW-B
 */
public class Calcular {
    private String fecha_entrada;
    private String fecha_salida;
    private String tipo_habitacion;

    public Calcular(String fecha_entrada, String fecha_salida, String tipo_habitacion) {
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.tipo_habitacion = tipo_habitacion;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

   
    
    public double costeTotal(){
        double coste_total = 0;
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd");
        int dias = 0;
        try {
            Date entrada = formato1.parse(this.fecha_entrada);
            Date salida = formato1.parse(this.fecha_salida);
            dias=(int) ((salida.getTime()-entrada.getTime())/86400000);
        } catch (ParseException ex) {
            Logger.getLogger(Calcular.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch(this.tipo_habitacion){
            case "normal":
                 coste_total= 50*dias+(50+(50*0.21));
                break;
            case "superior":
                coste_total= 75*dias+(75+(75*0.21));
                break;
        }
        return coste_total;
    }
}
