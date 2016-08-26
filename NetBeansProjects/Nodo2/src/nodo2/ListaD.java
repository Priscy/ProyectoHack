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
public class ListaD {

   
    private Nodo2 raiz;
    private int cont;
    private Nodo2 fin;
    
    public ListaD(Nodo2 raiz) {
        this.raiz = raiz;
        fin=raiz;
        cont =0;
    } 
    
    public ListaD(){
        raiz=null;
    }
    
    public Nodo2 getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo2 raiz) {
        this.raiz = raiz;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public Nodo2 getFin() {
        return fin;
    }

    public void setFin(Nodo2 fin) {
        this.fin = fin;
    }
   
     public boolean estaVacia(){
        if(raiz==null){
            return true;
        } else{
            return false;
        }
    }
     
    public void limpiar(){
        raiz=null;
        cont=0;
    }
     
    public void imprimir(){
       Nodo2 tmp=raiz;
       while(tmp!=null){
           System.out.println(tmp.getInfo());
           tmp=tmp.getPtrd();
       }
        
    }
    
    public void imprimirAlrevez(){
       Nodo2 tmp=fin;
       while(tmp!=null){
           System.out.println(tmp.getInfo());
           tmp=tmp.getPtri();
       }
        
    }
    
    public int size(){
        return cont;
    }
    
     public void agregarI(Nodo2 nuevo){
        if (estaVacia()){
            raiz=nuevo;
            fin=nuevo;
            
        } else{
            nuevo.setPtrd(raiz);
            raiz.setPtri(nuevo);
            raiz=nuevo;
        }
        cont++;
    
    } 
    
     public void agregarF(Nodo2 nuevo){
       if(estaVacia()){
          raiz=fin=nuevo;
          
       } else{
          fin.setPtrd(nuevo);
          nuevo.setPtri(fin);
          fin=nuevo;
       }
       cont++;
       
    }
    
    public void agregarP(Nodo2 nuevo, int pos){
        if((size()+1) <pos){
            System.out.println("Error, no se puede agregar en esta posicion ");
        }
        if(pos==0){
            agregarI(nuevo);
        }else if(pos ==size()){
            agregarF(nuevo);
        }else{
            Nodo2 tmpI=raiz;
            Nodo2 tmpD=raiz;
            for(int i=0; i<pos-1; i++){
                tmpI=tmpI.getPtrd();
                
            }
            tmpD=tmpI.getPtrd();
           
            nuevo.setPtrd(tmpD);
            nuevo.setPtri(tmpI);
            tmpI.setPtrd(nuevo);
            tmpD.setPtri(nuevo);
            cont++;
        }
    }
    
    public Nodo2 borraP(){
        if(estaVacia()){
            System.out.println("No hay nada que borrar");
            return null;
        } else {
            Nodo2 tmp=raiz;
            raiz=tmp.getPtrd();
            tmp.setPtri(null);
            cont--;
            return tmp;
        }
    }
    
     public Nodo2 borraF(){
        if(estaVacia()){
            System.out.println("No hay nada que borrar");
            return null;
        } else{
            Nodo2 tmp=raiz;
            for(int i=1; i<size(); i++){
                tmp=tmp.getPtrd();
            }
             tmp.setPtrd(null);
             Nodo2 x= fin;
             fin=tmp;
             cont--;
             return x;
        }
    }
     
     public Nodo2 borraPos(int pos){
        if(size() <pos){
            System.out.println("Error, la posicion que desea borrar no existe");
            return null;
        }
        if(pos==0){
            borraP();
        }else if(pos==size()){
            borraF();
        }else {
            Nodo2 tmp=raiz;
            for(int i=0; i<pos-1; i++){
                tmp=tmp.getPtrd();
            }
            Nodo2 tmpPos=raiz;
            for(int i=0; i<pos; i++){
                tmpPos=tmpPos.getPtrd();
            }
            tmp.setPtrd(tmpPos.getPtrd());
            Nodo2 x=tmpPos;
            tmpPos.setPtri(null);
            cont--;
            return x;
        }
       return  null;
    }
    
     public int obtener(int pos){
        if( pos>size() || pos<0){
            System.out.println("Esta posicion no puede ser recuperada");
            return -1;
        } else{
            Nodo2 x=raiz;
          
            for(int i=0; i<pos; i++){
                x=x.getPtrd();
            }
            int num=x.getInfo();
           
         return num;
        }
    }
    
    
}
