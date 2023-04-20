/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5Practicos;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio5Practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService sc = new PersonaService();
        Persona uno = sc.crearPersona();
        System.out.println("La edad es: " + sc.calcularEdad(uno));
        System.out.println("La edad es: " + sc.calcularEdad2(uno));
//      System.out.println("");
        System.out.println("La edad es menor que 21: " + sc.menorQue(uno, 21));
        System.out.println("Los datos ingresados son: "+ sc.mostrarPersona(uno));
        
    }

}
