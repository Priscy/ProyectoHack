/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lzw;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class LZW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner tec= new Scanner(System.in);
     String texto= tec.next();
     boolean arr[] = new boolean[26];
     Byte cont=0;
     Hashtable<String,Byte> diccio= new Hashtable();
     
     
     for(int i=0; i<texto.length(); i++){
         arr[(int)texto.charAt(i)-97]=true; 
     }
     
     for(int i=0; i<arr.length; i++){
        if(arr[i]==true){
         String x="";
         x +=(char)(97+i); 
         diccio.put(x,cont);
         cont++;
        }
     }
     int cont2=0;
     String patron="";
     Byte valor=-1;
     ArrayList<Byte> comp = new ArrayList<Byte>(); 
     while(cont2 <=texto.length()){
         
         if(diccio.containsKey(patron)==true){
            valor=diccio.get(patron); 
         }
         if(cont2!=texto.length()){
            patron+=texto.charAt(cont2);
            if(diccio.containsKey(patron)==true){
                valor=diccio.get(patron); 
            }
            else{
             diccio.put(patron,cont);
             cont++;
             comp.add(valor);
             patron="";
             patron+=texto.charAt(cont2);
             valor=-1;
            }
         } else{
             comp.add(valor);
         }
         System.out.println(diccio);
         cont2++;
     }
     
        System.out.println(comp);
    }
    
}
//aaabbbbbbaabaaba
//aaaaaaccaaababbccaaabbaaccc