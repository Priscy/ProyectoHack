/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enorden;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Priscila
 */
public class main {
    public static void main(String [] args){
    Scanner tec= new Scanner(System.in);
        String entrada=tec.next();
        Stack pila= new Stack();
         Arboles arbol= new Arboles();
        do{
            pila.push(entrada);
            entrada=tec.next();
            if(entrada.equals("*")==true){
                System.out.println(pila);
                
                while(pila.isEmpty()==false){
                  String linea=(String)pila.pop();
                  
                   for(int i=0; i<linea.length(); i++){
                       arbol.insertar(new Nodo(linea.charAt(i)+"")); 
                   }
               }
                arbol.EliminarGdo2(new Nodo("j"), arbol.getRaiz());
                arbol.enOrden(arbol.getRaiz());
                //arbol.buscar(new Nodo("s"));
               // arbol.buscar(new Nodo("z"),arbol.getRaiz());
                pila.clear();
                arbol.limpiar();
                entrada=tec.next();
            } 
        }while(entrada.equals("$")==false);
            System.out.println(pila);
    }
}
/*
eba
jhk
dg
f
---eliminar d o j


ac
b
----eliminar b

*/