/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enorden;

/**
 *
 * @author Priscila
 */
class Nodo {
    private String info;
    private Nodo ptrd;
    private Nodo ptri;
    
    public Nodo(String info) {
        this.info=info;
    }
    
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    

    public Nodo getPtrd() {
        return ptrd;
    }

    public void setPtrd(Nodo ptrd) {
        this.ptrd = ptrd;
    }

    public Nodo getPtri() {
        return ptri;
    }

    public void setPtri(Nodo ptri) {
        this.ptri = ptri;
    }
   
}
