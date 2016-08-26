/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        int ncasos=0;
        int diam=0;
        int max=0;
        //int listacont=0;
        ncasos=tec.nextInt();
        do{
            //creacion de lista
            for(int i=0; i<ncasos; i++){
                diam=tec.nextInt();
                lista.add(diam);
            }
            //tomar el inicio del ciclo
            for(int i=lista.size()-1; i>=0; i--){
                int inicio=lista.get(i);
                lista2.add(inicio);
                //recorrido de esa posicion hacia abajo
               for(int j=i; j>0; j--){
                  if(lista.get(j-1)<lista.get(i)){
                      if(lista2.size()==1){
                      lista2.add(lista.get(j-1));
                      }else{
                          //System.out.println("lista 2 "+lista2);
                          if(lista.get(j-1)> lista2.get(lista2.size()-1)){
                              lista2.remove(lista2.size()-1);
                              lista2.add(lista.get(j-1));
                          }else{
                              lista2.add(lista.get(j-1));
                          }
                         
                      }
                     //listacont++;
                  }
               }
               //guardar el valor del tamano de lista mas grande
               if(lista2.size()>max){
                max=lista2.size();
               }
               lista2.clear();
              
            }
          
          System.out.println(max);
           max=0;
           lista.clear();
          ncasos=tec.nextInt();
         
        }while(ncasos>=0);
        
       }
    
    
}
/**
 12
 200
 1300
 1800
 1000
 100
 2000
 2500
 2900
 1100
 3000
 1200
 2400 
 5
 200
 300
 500
 100
 3000
 4
 1000
 700
 500
 200
 -1
 
 */