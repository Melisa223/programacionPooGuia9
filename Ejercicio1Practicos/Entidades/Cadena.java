/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Meli
 */
public class Cadena {
    private String frase;
    private int longFrase;
    

    public Cadena() {
 
    }

    public Cadena(String frase, int longFrase) {
        this.frase = frase;
        this.longFrase = longFrase;
        
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longFrase=" + longFrase + '}';
    }
    
    
}

