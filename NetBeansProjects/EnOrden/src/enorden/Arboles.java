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
public class Arboles {
    private Nodo raiz;
    private Nodo papa;

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void preOrden(Nodo actual){
        if(actual!=null){
            System.out.println(actual.getInfo());
            preOrden(actual.getPtri());
            preOrden(actual.getPtrd());
        }
    }
    
    public void enOrden(Nodo actual){
        if(actual!=null){
            enOrden(actual.getPtri());
            System.out.println(actual.getInfo());
            enOrden(actual.getPtrd());
        }
    }
    
     public void porOrden(Nodo actual){
        if(actual!=null){
            porOrden(actual.getPtri());
            porOrden(actual.getPtrd());
            System.out.println(actual.getInfo());
        }
    }
     
    public void insertar(Nodo letra){
        if(raiz==null){
             raiz=letra;
        }else {
            Nodo tmp=raiz;
            //movimiento a la derecha
            do{
                if(tmp.getInfo().compareTo(letra.getInfo()) <0){
                    if(tmp.getPtrd()!=null){
                        tmp=tmp.getPtrd();
                        continue;
                    }else{
                        tmp.setPtrd(letra);
                        break;
                    }
                }else{
                    if(tmp.getPtri()!=null){
                        tmp=tmp.getPtri();
                        continue;
                    } else{
                        tmp.setPtri(letra);
                        break;
                    }
                }
            }while(true);
        }
        
    }
    
    public boolean buscar(Nodo letra){
        if(raiz==null){
            System.out.println("No esta");
            return false;
        }else {
            Nodo tmp=raiz;
            do{
               if(tmp.getInfo().compareTo(letra.getInfo())==0){
                   System.out.println("si esta");
                    return true;
               }else{
                    if(tmp.getInfo().compareTo(letra.getInfo()) <0){
                        papa=tmp;
                        tmp=tmp.getPtrd();
                        continue;
                    }
                    else{
                      papa=tmp;
                      tmp=tmp.getPtri();
                      continue;
                    }
                } 
               
            }while(tmp!=null);
            System.out.println("No esta");
            return false;
        }  
    }
    
    public boolean buscar(Nodo letra, Nodo tmp){
        if(tmp==null){
            System.out.println("No esta");
            return false;
        } else if (tmp.getInfo().compareTo(letra.getInfo())==0){
            //System.out.println("Si esta metodo 2"+ " papa: "+papa.getInfo());
            return true;
        } else if(tmp.getInfo().compareTo(letra.getInfo()) <0){
            papa=tmp;
            buscar(letra, tmp.getPtrd());
        } else {
            papa=tmp;
            buscar(letra, tmp.getPtri());
        }
            
    return true;    
    }
    
    public void limpiar(){
        raiz=null;
    }
    
    public Nodo EliminarGdo0(Nodo letra, Nodo tmp){
        Nodo x;
        if(tmp==null){
            System.out.println("No esta");
            return null;
        }
        
        if(buscar(letra,raiz)==true) {
            //System.out.println("papaaaaa "+papa.getInfo());
            if (papa == null){
               x=raiz;
                raiz=null;
                System.out.println(x.getInfo()+" esta en la raiz");
                return x; 
            }else if(papa.getPtrd().getInfo().compareTo(letra.getInfo())==0){
                x=papa.getPtrd();
                papa.setPtrd(null);
                return x;
            }else {
                x=papa.getPtri();
                papa.setPtri(null);
                return x;
            }
    }
      return null;    
    }
    
    public Nodo EliminarGdo1(Nodo letra, Nodo tmp){
        Nodo x;
        if(tmp==null){
            System.out.println("No esta");
            return null;
        }
        
        if(buscar(letra,raiz)==true) {
            //System.out.println("papaaaaa "+papa.getInfo());
            if (letra.getInfo().compareTo(raiz.getInfo()) == 0){
                tmp=raiz;
               if(tmp.getPtrd() != null){
                   x=tmp;
                   raiz=tmp.getPtrd();
                   return x;
               } else {
                   x=tmp;
                   raiz=tmp.getPtri();
                   return x;
               }
            }else {
                if(papa.getInfo().compareTo(letra.getInfo())<0){
                    x=papa.getPtrd();
                    if(x.getPtrd()!=null){
                        papa.setPtrd(x.getPtrd());
                    }
                    else{
                        papa.setPtrd(x.getPtri());
                    }
                }else {
                    x=papa.getPtri();
                    if(x.getPtrd()!=null){
                        papa.setPtri(x.getPtrd());
                    }
                    else{
                        papa.setPtri(x.getPtri());
                    }
                }
                return x;  
               
                
            }
    }
      return null;    
    }
    
   public Nodo EliminarGdo2(Nodo letra, Nodo tmp){
       if(tmp==null){
            System.out.println("No esta");
            return null;
        } 
       if(buscar(letra,raiz)==true) {
           Nodo x;
           if(raiz.getInfo().compareTo(letra.getInfo())==0){
               x=raiz;
           }else{
                if(papa.getInfo().compareTo(letra.getInfo())<0){
                    x=papa.getPtrd();
                }else{
                    x=papa.getPtri();
                }
           }
           tmp=x.getPtri();
           while(tmp.getPtrd()!=null){
               tmp=tmp.getPtrd();
               
           }
           Nodo tmp2=tmp;
           if(tmp.getPtrd()!=null || tmp.getPtri()!=null){
               EliminarGdo1(tmp,raiz);
           }else{
               EliminarGdo0(tmp,raiz);
           }
           Nodo deleted=x;
           x.setInfo(tmp2.getInfo());
           return deleted;
       }
       
       return null;
       
   }
   
      
           
    
}
