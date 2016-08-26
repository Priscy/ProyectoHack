/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo2;

/**
 *
 * @author Priscila
 */
public class Nodo2 {
     private int info;
     private Nodo2 ptrd;
     private Nodo2 ptri;

    public Nodo2(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo2 getPtrd() {
        return ptrd;
    }

    public void setPtrd(Nodo2 ptrd) {
        this.ptrd = ptrd;
    }

    public Nodo2 getPtri() {
        return ptri;
    }

    public void setPtri(Nodo2 ptri) {
        this.ptri = ptri;
    }
   
  
}
