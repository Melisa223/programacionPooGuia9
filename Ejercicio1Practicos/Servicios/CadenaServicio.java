/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class CadenaServicio {
String nuevaFrase;    
    
    
    public void mostrarVocales(Cadena uno){
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales
    //que tiene la frase ingresada.
    int contVocal=0;
    
    Scanner leer = new Scanner(System.in);
   
    System.out.println("Ingrese una frase: ");
    uno.setFrase(leer.nextLine());
    uno.setLongFrase(uno.getFrase().length());
    for (int i = 0; i < uno.getLongFrase(); i++) {   
     String letra= uno.getFrase().substring(i, i+1);
     if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") ||letra.equalsIgnoreCase("o") ||letra.equalsIgnoreCase("u") ) {      
        contVocal++;
        }    
    }
        System.out.println("La cantidad de vocales es: " + contVocal);
}    

public void invertirFrase(Cadena uno){
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
//asac".

String letra="";
System.out.println("La frase al revés es: ");   
for (int i = uno.getLongFrase(); i > 0; i--) { 
//System.out.println(uno.getFrase());
//System.out.println(uno.getLongFrase());
letra= uno.getFrase().substring(i-1,i);
     
System.out.print(letra);
} 
    System.out.println("");    
}

  public void vecesRepetido(Cadena uno){
   //Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    int contCaracter=0;
    String caracter;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un carácter a comparar: ");
    caracter = leer.nextLine();
    uno.setLongFrase(uno.getFrase().length());
    for (int i = 0; i < uno.getLongFrase(); i++) {   
     String letra= uno.getFrase().substring(i, i+1);
     if (letra.equalsIgnoreCase(caracter)) {      
        contCaracter++;
        }    
    }
        System.out.println("El carácter " + caracter + " se repite: "  + contCaracter );

  }
  
  

public void compararLongitud (Cadena uno){
  
//Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese una nueva frase: ");
    nuevaFrase = leer.nextLine();
    
    if (uno.getLongFrase()< nuevaFrase.length()) {
        System.out.println("La longitud de la frase nueva es mayor a la inicial.");   
    }else if(uno.getLongFrase()== nuevaFrase.length()){          
        System.out.println("La longitud de la frase nueva es igual a la inicial."); 
    }else {
        System.out.println("La longitud de la frase nueva es menor a la inicial."); 
    }
}

public void unirFrases (Cadena uno){
//Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
System.out.println("La unión de ambas frases es: ");
System.out.println(uno.getFrase() + ", " + nuevaFrase );
}

public void reemplazar(Cadena uno){
   //Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
//seleccionado por el usuario y mostrar la frase resultante.
    String letra="";
    String caracter;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el carácter cambiar por la letra a: ");
    caracter = leer.nextLine();
    String fraseResultante = uno.getFrase().replace('a', caracter.charAt(0));
    System.out.println("La frase resultante, con letra cambiada es ["+fraseResultante+"]");
    
    //uno.setLongFrase(uno.getFrase().length());    
    //for (int i = 0; i < uno.getLongFrase(); i++) {   
    //letra= uno.getFrase().substring(i, i+1);
    //if (letra.equalsIgnoreCase("A")) {      
    // letra= caracter;
    //  }    
    // }
    // System.out.println("La frase cambiada es: ");
    //  System.out.print(letra);
}


public boolean contiene(Cadena uno){
//Método contiene(String letra), deberá comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no
    boolean contiene=true;
    //String letra="";       
    String caracter;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la letra que desea buscar: ");
    caracter = leer.nextLine(); 
    //uno.setLongFrase(uno.getFrase().length());   
    //for (int i = 0; i < uno.getLongFrase(); i++) {   
    //letra = uno.getFrase().substring(i, i+1);
    if (uno.getFrase().contains(caracter)) {
    contiene= true;
     System.out.println("La frase contiene la letra buscada");
    }else{
    contiene= false;
    System.out.println("La frase NO contiene la letra buscada");
    }
   
    return contiene;
}
    //}
//}

//public boolean contiene(Cadena uno)
  // if (caracter)) {      
      //   System.out.println("La letra se encuentra en la frase");
      //  }else{
         //System.out.println("La letra no se encuentra en la frase");

//public boolean contiene(Cadena cadena, String letra) {
        //return cadena.getFrase().contains(letra);
    //}

//public boolean contiene(Cadena c, String letraUsuario) {

        //if (c.getFrase().contains(letraUsuario)) {
           // System.out.println("La frase contiene la letra '" + letraUsuario + "'.");
           // return true;
       // } else {
           // System.out.println("La frase no contiene la letra '" + letraUsuario + "'.");
           // return false;
      //  }
//System.out.print("Ingresar letra.\n> ");
                    //fraseUsuario = input.next();
                   // contiene(c, fraseUsuario);

}