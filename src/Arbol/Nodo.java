/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

/**
 *
 * @author RigoBono
 */
public class Nodo {
    
    /**
     * 
     */
    private Nodo derecha=null;
    private Nodo izquierda=null;
    
    private Integer valor=null;
    
    /**
     * 
     * @param derecha Es un nodo que tienen un valor superior al valor de esta raiz
     * @param izquierda Es un nodo que tienen un valor inferior al valor de esta raiz
     * @param valor la cosa a guardar y comparar
     */
    public Nodo(Nodo derecha, Nodo izquierda, Integer valor) {
        this.derecha = derecha;
        this.izquierda = izquierda;
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    
    
    
    
    
}
