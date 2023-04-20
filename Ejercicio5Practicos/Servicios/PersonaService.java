/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
//Método crearPersona que pida al usuario Nombre y fecha de
//nacimiento de la persona a crear. Retornar el objeto Persona creado
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("Ingrese el día: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        Date fechaNac = new Date(anio - 1900, mes - 1, dia);
//System.out.println(fechaNac);
        return new Persona(nombre, fechaNac);
    }

public int calcularEdad(Persona uno){   
//Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
Date fechaNacimiento = uno.getFechaNac();
        Date fechaActual = new Date();
//        System.out.println(Math.abs(fechaActual.getYear()-persona.getFechaNacimiento().getYear())+" Años");
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() ||
                (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
}

public int calcularEdad2(Persona uno) {
      return Math.abs(uno.getFechaNac().getYear()-(new Date()).getYear());
    }

public boolean menorQue(Persona uno, int edad){
//Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.
return calcularEdad(uno)<edad;
}

public String mostrarPersona(Persona uno){
//Método mostrarPersona que muestra la información de la persona
//deseada.
return uno.toString();
}
}
