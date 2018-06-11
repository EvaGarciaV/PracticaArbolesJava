/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Arbol.Nodo;

/**
 *
 * @author RigoBono
 */
public class ArbolUtil {

    /**
     * Comparamos con el valor de la raiz, 
     *  Si es igual al valor a buscar retornamos la true
     *  Si no es igual, revisamos si el valor es mayor o menor al de la raiz
     *  Y hacemos recursion respectivamente con izquierda o derecha
     * @param value
     * @param raiz
     * @return 
     */
    public static boolean isValue(Integer value, Nodo raiz) {
        if (raiz.getValor().intValue() == value.intValue()) {
            return true;
        }

        if (raiz.getDerecha() == null && raiz.getIzquierda() == null) {
            return false;
        } else {
            if (raiz.getValor().intValue() < value.intValue()) {
                if (raiz.getDerecha() != null) {
                    return isValue(value, raiz.getDerecha());
                }
                return false;
            } else {
                if (raiz.getIzquierda() != null) {
                    return isValue(value, raiz.getIzquierda());
                }
                return false;
            }
        }

    }

    /**
     * Buscaria si existe arbol,
     * sino:
     *      Creo el arbol con el primero nodo con el valor insertado
     * si si existe
     *      Reviso si es mayor o menor que la raiz en turno para encontrar
     *      si se inserta en la derecha o izquierda, o hago un nuevo recorrido
     *      con el siguiente nodo
     *       
     * @param value Valor a insertar en el nodo
     * @param arbol Arbol donde se insertara
     * @return El arbol entero 
     */
    public static Nodo insert(Integer value, Nodo arbol) {
        Nodo valorPorInsertar = new Nodo(null, null, value);
        if (arbol != null) {
            if (arbol.getValor().intValue() > value.intValue()) {
                if (arbol.getIzquierda() != null) {
                    insert(value, arbol.getIzquierda());
                } else {
                    arbol.setIzquierda(valorPorInsertar);
                    return arbol;
                }
            } else {
                if (arbol.getDerecha() != null) {
                    insert(value, arbol.getDerecha());
                } else {

                    arbol.setDerecha(valorPorInsertar);
                    return arbol;
                }
            }
        }

        return valorPorInsertar;
    }

}
