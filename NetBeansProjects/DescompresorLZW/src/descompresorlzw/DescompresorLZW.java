/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descompresorlzw;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class DescompresorLZW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        Hashtable<Byte,String> diccio= new Hashtable();
        ArrayList<Byte> comp = new ArrayList<Byte>(); 
        Byte cont=0;
        Byte key=0;
        String value="";
        Byte entrada=0;
        String salida="";
        
        System.out.println("Introduce la entrada");
        entrada= tec.nextByte();
        do{
            comp.add(entrada);
            entrada= tec.nextByte();
        }while(entrada>=0);
        
        System.out.println("Introduce los keys y sus valores");
        key=tec.nextByte();
        do{
           value=tec.next();
           cont=key;
           diccio.put(key,value);
           key=tec.nextByte();
        }while(key>=0);
        
        System.out.println(diccio);
        //System.out.println(comp);
        
        for(int i=0; i<comp.size(); i++){
            if(i==0){
                value=diccio.get(comp.get(i));
                salida+=value;
            }else{
                
                if(diccio.containsKey(comp.get(i))==true){
                    value=diccio.get(comp.get(i));
                    //System.out.println("diccionaro "+diccio);
                    //System.out.println("valor "+value);
                    salida+=value;
                    String valueQ=diccio.get(comp.get(i-1));
                    cont++;
                    diccio.put(cont, valueQ += value.charAt(0));

                }else {
                    value=diccio.get(comp.get(i-1));
                    cont++;
                    diccio.put(cont, value += value.charAt(0));
                    salida+=value;
                }
            }
        }
        System.out.println(diccio);
        System.out.println(salida);
    }
    
    
}
