/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author Meli
 */
public class ParDeNumerosService {
  
    
    
    public ParDeNumeros crearNums(){
    double num1 = Math.random()*10;
    double num2 = Math.random()*10;
    return new ParDeNumeros(num1,num2);
    }
 
public void mostrarValores(ParDeNumeros primero){
//Método mostrarValores que muestra cuáles son los dos números
//guardados.
System.out.println("El primer número es: ");
System.out.println(primero.getNum1());
System.out.println("El segundo número es: ");
System.out.println(primero.getNum2());
}

public double devolverMayor(ParDeNumeros primero){
//Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor
double mayor = Math.max(primero.getNum1(), primero.getNum2());
System.out.println("El número mayor es: ");
System.out.println(mayor);   

return mayor;
}

public void calcularPotencia(ParDeNumeros primero){
//Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
//Math.max(primero.getNum1(), primero.getNum2());
ParDeNumerosService SC = new ParDeNumerosService();
double mayor = Math.round(SC.devolverMayor(primero));
double menor = Math.round(Math.min(primero.getNum1(), primero.getNum2()));
    System.out.println("La potencia del número mayor elevado al menor es: ");
System.out.println(Math.pow(mayor, menor));
}

public void calcularRaiz(ParDeNumeros primero){
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//valor absoluto del número.
ParDeNumerosService SC = new ParDeNumerosService();
double mayor = Math.abs(SC.devolverMayor(primero));
double menor = Math.abs(Math.min(primero.getNum1(), primero.getNum2()));  
System.out.println("La raiz cuadrada del valor menor es: ");
System.out.println(Math.sqrt(menor));


}
}

