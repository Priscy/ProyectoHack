 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priscila
 */
public class Nodo {
    private int info;
    private Nodo ptr;
    
    public Nodo(int info) {
        this.info = info;
    }
   
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getPtr() {
        return ptr;
    }

    public void setPtr(Nodo ptr) {
        this.ptr = ptr;
    }
    
    
    
}
