/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Ejercicio1Extra;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char resp =' ';
        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[(int) (Math.random() * 12)];
       
        do {
        System.out.println("Adivine el mes secreto: ");
        String adivine = leer.next();
        if (adivine == mesSecreto) {
            System.out.println("¡Ha acertado!");
            break;
        }
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            System.out.println("Desea continuar intentando. (s/n)");
            resp = leer.next().toLowerCase().charAt(0);          
        } while (resp=='s');
        
    }

}
