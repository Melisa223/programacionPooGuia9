/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1Practicos;

import Entidades.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author Meli
 */
public class Ejercicio1Practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CadenaServicio Sc = new CadenaServicio();
    Cadena uno = new Cadena();
    Sc.mostrarVocales(uno);
    Sc.invertirFrase(uno);
    Sc.compararLongitud(uno);
    Sc.reemplazar(uno);
    Sc.vecesRepetido(uno);
    Sc.unirFrases(uno);
    Sc.contiene(uno);
    
    }
    
}
