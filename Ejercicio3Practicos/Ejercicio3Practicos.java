/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Practicos;


import Servicios.ArregloService;

/**
 *
 * @author Meli
 */
public class Ejercicio3Practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    double [] arregloA = new double[50];
    double [] arregloB = new double[20]; 
    ArregloService SC = new ArregloService();
    
    //Arreglos uno = new Arreglos(); 
    SC.inicializarA(arregloA);
    System.out.println("");
    SC.mostrar(arregloA);
    System.out.println("");
    SC.ordenar(arregloA);
    SC.inicializarB(arregloB, arregloA);
    System.out.println("");
    SC.mostrar(arregloA);
    System.out.println(" ");
    SC.mostrarB(arregloB);
    
    
   // Arreglos dos = SC.inicializarA(arregloB);
    
    }
    
}
