/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Priscila
 */
import java.util.Scanner;
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int n=tec.nextInt();

        
        int [][]arre= new int[n][n];    
        
        for (int f=0; f<arre.length; f++){
            for(int c=0; c<arre.length; c++){
             if(c-(arre.length-f-1)==0|| c-(arre.length-f-1)==2){
                    if(c%2==0){
                     arre[f][c]=c+(arre.length-f-1);
                    } else if( c%2!=0){
                     arre[f][c]=c+(arre.length-f-1)-1;
                    }
              } else if(c==0 && (arre.length-f-1)==0){
                 arre[f][c]=0;
              } else{
                 arre[f][c]=0;
              }    
//              System.out.println(arre[f][c]);
            }
           
        }
        
        for(int []i :arre){
            for(int z:i){
                System.out.print(z+"    ");
            }
            System.out.println("");
        
        }
    }
    
}
