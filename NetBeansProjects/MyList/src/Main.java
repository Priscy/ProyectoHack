
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priscila
 */
public class Main {
    
    public static void main(String[] args){
//        List myList = new List(new Nodo(0));
//          
//          myList.agregarP(new Nodo(1),1);
//          myList.agregarP(new Nodo(2),2);
//          myList.agregarP(new Nodo(3),3);
//          myList.agregarP(new Nodo(4),4);
//          myList.agregarP(new Nodo(5),5);
////          myList.borraPos(5);
////          myList.obtener(0);
//          myList.imprimir();
                
        Scanner tec= new Scanner(System.in);
        int n=0;
        List lista = new List();
        n=tec.nextInt();
        
        while(n>=0 && n<=9){
            lista.agregarF(new Nodo(n));
            n=tec.nextInt();
         }
        
        List [] arr= new List[10];
        for(int i=0; i<arr.length; i++){
            arr[i]= new List(new Nodo(i));
        }

        for(int j=0; j<lista.size(); j++){
           arr[lista.obtener(j)].agregarF(new Nodo(lista.obtener(j)));
        }
        
        lista.limpiar();
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].size(); j++){
                lista.agregarF(new Nodo (arr[i].obtener(j)));
            }
        }

        
       lista.imprimir();

    
    }
}
