/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author Priscila
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> lista= new ArrayList();
        lista.add(34);
        lista.add(5);
        lista.add(7);
        lista.add(3,100);
        
        ArrayList <Integer> lista2= new ArrayList();
        lista2.addAll(lista);
    }
    
}
