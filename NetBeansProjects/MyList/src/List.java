/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priscila
 */
public class List {
    private Nodo raiz;
    private Nodo fin;
    private int cont;
    
    public Nodo getRaiz() {
        return raiz;
       
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public List(Nodo raiz) {
        this.raiz = raiz;
        fin=raiz;
        cont=0;
    }
    
    public List(){
        raiz=null;
    }
    
    public boolean estaVacia(){
        if(raiz==null){
            return true;
        } else{
            return false;
        }
    }
    
    public void agregarI(Nodo nuevo){
        if (estaVacia()){
            raiz=nuevo;
            fin=nuevo;
            
        } else{
            nuevo.setPtr(raiz);
            raiz=nuevo;
        }
        cont++;
    
    }
    
    public void agregarF(Nodo nuevo){
       if(estaVacia()){
          raiz=fin=nuevo;
          
       } else{
          fin.setPtr(nuevo);
          fin=nuevo;
       }
       cont++;
       
    }
    public int size(){
        return cont;
    }
    
    public void agregarP(Nodo nuevo, int pos){
        if((size()+1)<pos){
            System.out.println("Error, no se puede agregar ene sta posicion ");
        }
        if(pos==0){
            agregarI(nuevo);
        }else if(pos ==size()){
            agregarF(nuevo);
        }else{
            Nodo tmp=raiz;
            for(int i=0; i<pos-1; i++){
                tmp=tmp.getPtr();
            }
            nuevo.setPtr(tmp.getPtr());
            tmp.setPtr(nuevo);
            cont++;
        }
    }
    
    public void imprimir(){
       Nodo tmp=raiz;
       while(tmp!=null){
           System.out.println(tmp.getInfo());
           tmp=tmp.getPtr();
       }
        
    }
    
    public void limpiar(){
        raiz=null;
        cont=0;
    }
    
    public Nodo borraP(){
        if(estaVacia()){
            System.out.println("No hay nada que borrar");
            return null;
        } else {
            Nodo tmp=raiz;
            raiz=tmp.getPtr();
            tmp.setPtr(null);
            cont--;
            return tmp;
        }
    }
    
    public Nodo borraF(){
        if(estaVacia()){
            System.out.println("No hay nada que borrar");
            return null;
        } else{
            Nodo tmp=raiz;
            for(int i=1; i<size(); i++){
                tmp=tmp.getPtr();
            }
             tmp.setPtr(null);
             Nodo x= fin;
             fin=tmp;
             cont--;
             return x;
        }
    }
    
    public Nodo borraPos(int pos){
        if(size() <pos){
            System.out.println("Error, la posicion que desea borrar no existe");
            return null;
        }
        if(pos==0){
            borraP();
        }else if(pos==size()){
            borraF();
        }else {
             Nodo tmp=raiz;
            for(int i=0; i<pos-1; i++){
                tmp=tmp.getPtr();
            }
            Nodo tmpPos=raiz;
            for(int i=0; i<pos; i++){
                tmpPos=tmpPos.getPtr();
            }
            tmp.setPtr(tmpPos.getPtr());
            Nodo x=tmpPos;
            tmpPos.setPtr(null);
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
        Nodo x=raiz;
            for(int i=0; i<pos; i++){
                x=x.getPtr();
            }
         int num=x.getInfo();
//         System.out.println(num); 
         return num;
        }
    }
    
}
