/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo2;

import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class Main2 {
    public static void main (String[] args){
//        ListaD myList = new ListaD(new Nodo2(0));
//        
//        myList.agregarF(new Nodo2(1));
//        myList.agregarF(new Nodo2(2));
//        myList.agregarF(new Nodo2(3));
//        myList.agregarF(new Nodo2(4));
//        myList.agregarF(new Nodo2(5));
//        myList.agregarP(new Nodo2(100),3);
//        
////        myList.borraPos(3);
////        myList.borraF();
////        myList.borraP();
//        myList.obtener(3);
//        myList.imprimir();
//        
        Scanner tec= new Scanner(System.in);
        int n=0;
        ListaD lista = new ListaD();
        n=tec.nextInt();
        while(n>=0){
            lista.agregarF(new Nodo2(n));
            n=tec.nextInt();
        }
        
        ListaD [] arr= new ListaD[10];
        for(int i=0; i<arr.length; i++){
            arr[i]= new ListaD();
        }

        for(int x=0; x<4; x++){
           int y=0;
            for(int j=0; j<lista.size(); j++){
              
                 if(x==0){
                     y=lista.obtener(j)%10;
                 }else if(x==1){
                     y=((lista.obtener(j))/10)%10;
                 }else if(x==2){
                     y=((lista.obtener(j)/10)/10)%10;
                 }else if(x==3){
                    y=(((lista.obtener(j)/10)/10)/10)%10;
                 }
                 
                 arr[y].agregarF(new Nodo2(lista.obtener(j)));
                  
            }
        
           
            lista.limpiar();
            
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].size(); j++){
                    lista.agregarF(new Nodo2 (arr[i].obtener(j)));
                }
            }
           
            
            for(int i=0; i<arr.length; i++){
                    arr[i].limpiar();
                }
         }
         
         lista.imprimir();
         
       
   }
    
}
