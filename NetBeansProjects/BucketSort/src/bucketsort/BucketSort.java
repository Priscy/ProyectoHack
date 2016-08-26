/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucketsort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class BucketSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int n=0;
        ArrayList <Integer> lista= new ArrayList();
         n=tec.nextInt();
        while(n>=0 && n<=9){
            lista.add(n);
            n=tec.nextInt();
         }
        ArrayList<Integer>[] bucket=new ArrayList[10];
        for(int i=0; i<bucket.length; i++){
            bucket[i]= new ArrayList();
        }
        
        for(int j=0; j<lista.size(); j++){
           bucket[lista.get(j)].add(lista.get(j));
           
        }
        
        lista.clear();
        
        for(int i=0; i<bucket.length; i++){
            for(int j=0; j<bucket[i].size(); j++){
                lista.add(bucket[i].get(j));
            }
        }
        
        for(Integer x: lista){
            System.out.println(x +" ");
        }

    }
    
}

