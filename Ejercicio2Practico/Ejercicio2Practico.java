/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2Practico;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author Meli
 */
public class Ejercicio2Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosService SC = new ParDeNumerosService();
        ParDeNumeros primero = SC.crearNums();
        SC.mostrarValores(primero);
            //SC.devolverMayor(primero);
        SC.calcularPotencia(primero);
        SC.calcularRaiz(primero);
        
        
        
        
        
    }
    
}
