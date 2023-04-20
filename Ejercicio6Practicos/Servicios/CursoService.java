/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class CursoService {
Scanner leer = new Scanner(System.in).useDelimiter("\n");

public String [] cargarAlumnos(){
//Método cargarAlumnos(): este método le permitirá al usuario ingresar
//los alumnos que asisten a las clases. Nosotros nos encargaremos de
//almacenar esta información en un arreglo e iterar con un bucle,
//solicitando en cada repetición que se ingrese el nombre de cada
//alumno.
String [] alumnos = new String [5];

    for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese el nombre del alumno: " + (i+1));
        alumnos[i] = leer.next();       
    }
return alumnos;
} 

public Curso crearCurso(){   
//Método crearCurso(): el método crear curso, le pide los valores de
//los atributos al usuario y después se le asignan a sus respectivos
//atributos para llenar el objeto Curso. En este método invocamos al
//método cargarAlumnos() para asignarle valor al atributo alumnos
System.out.println("Ingrese el nombre del curso: ");
String nombreCurso = leer.next();
//leer.nextLine();
System.out.println("Ingrese la cantidad de horas por día: ");
int cantidadHorasPorDia = leer.nextInt();
System.out.println("Ingrese la cantidad de días por semana: ");
int cantidadDiasPorSemana = leer.nextInt();
System.out.println("Ingrese el turno: ");
String turno = leer.next();
System.out.println("Ingrese el precio por hora: ");
int precioPorHora = leer.nextInt();
String [] alumnos = cargarAlumnos();
return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
}

public int calcularGananciaSemana1(Curso uno){
//Método calcularGananciaSemanal(): este método se encarga de
//calcular la ganancia en una semana por curso. Para ello, se deben
//multiplicar la cantidad de horas por día, el precio por hora, la
//cantidad de alumnos y la cantidad de días a la semana que se repite
//el encuentro.
return(uno.getCantidadHorasPorDia()* uno.getPrecioPorHora()*5*uno.getCantidadDiasPorSemana());
}

}
