/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6Practicos;

import Entidades.Curso;
import Servicios.CursoService;

/**
 *
 * @author Meli
 */
public class Ejercicio6Practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService sc = new CursoService();
        Curso uno = sc.crearCurso();
        System.out.println(uno);
        System.out.println("La ganancia por semana es: "+ sc.calcularGananciaSemana1(uno));
    }
    
}
