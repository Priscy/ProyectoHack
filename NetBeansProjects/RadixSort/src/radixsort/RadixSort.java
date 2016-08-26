/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class RadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int n=0;
        ArrayList <Integer> lista= new ArrayList();
        n=tec.nextInt();
        while(n>=0){
            lista.add(n);
            n=tec.nextInt();
        }
        
        ArrayList<Integer>[] bucket=new ArrayList[10];
            for(int i=0; i<bucket.length; i++){
                bucket[i]= new ArrayList();
            }
            
        for(int x=0; x<4; x++){
            int y=0;
            for(int j=0; j<lista.size(); j++){
                 if(x==0){
                     y=lista.get(j)%10;
                 }else if(x==1){
                     y=(lista.get(j)/10)%10;
                 }else if(x==2){
                     y=((lista.get(j)/10)/10)%10;
                 }else if(x==3){
                    y=(((lista.get(j)/10)/10)/10)%10;
                 }
                 bucket[y].add(lista.get(j));
             }
            
            lista.clear();

            for(int i=0; i<bucket.length; i++){
                for(int j=0; j<bucket[i].size(); j++){
                    lista.add(bucket[i].get(j));
                }
            }
            for(int i=0; i<bucket.length; i++){
                for(int j=0; j<bucket[i].size(); j++){
                    bucket[i].clear();
                }
            }
           
            
            
        }
        for(Integer x: lista){
                System.out.println(x +" ");
            }
    }
    
}
