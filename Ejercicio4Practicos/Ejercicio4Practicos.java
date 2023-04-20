/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4Practicos;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Meli
 */
public class Ejercicio4Practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FechaService SC = new FechaService();
       Date FechaNac = SC.fechaNacimiento();
       Date FechaAct = SC.fechaActual();
       SC.diferencia(FechaAct,FechaNac);
       SC.diferencia2(FechaAct,FechaNac);
    }
    
}
