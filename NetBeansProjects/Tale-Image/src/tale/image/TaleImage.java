/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tale.image;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Priscila
 */
public class TaleImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int cont=2;
         Queue tale= new LinkedList();
         int [][]arre= {{0,0,1,0,0,1,0,0},
                        {0,1,1,1,0,1,1,1},
                        {0,0,1,1,0,1,0,0},
                        {1,0,0,0,1,0,0,0},
                        {1,1,0,1,1,1,0,0},
                        {1,1,1,0,1,1,1,0},
                        {0,1,0,0,0,0,1,0},
                        {1,1,0,0,0,0,1,0}
         
         };
         
         for(int fila=0; fila<arre.length; fila++){
             for(int col=0; col<arre.length; col++){
                 if(arre[fila][col]==1){
                     
                     int f=fila;
                     int c=col;
                     arre[f][c]=cont;

                     tale.offer((f)*10+c);
                     
                do{
                    
                      f=(int)tale.peek()/10;
                      c=(int)tale.peek()%10;
                      tale.poll();
                      
                      if(f-1>=0 && arre[f-1][c]==1){
                          arre[f-1][c]=cont;
                          tale.offer((f-1)*10+c);
                      }
                      if(c+1<arre.length && arre[f][c+1]==1){
                           arre[f][c+1]=cont;
                          tale.offer(f*10+(c+1));
                      }
                      if(f+1<arre.length && arre[f+1][c]==1){
                           arre[f+1][c]=cont;
                          tale.offer((f+1)*10+c);
                      }
                      if(c-1>=0 && arre[f][c-1]==1){
                          arre[f][c-1]=cont;
                          tale.offer(f*10+(c-1));
                      }

                }while(!tale.isEmpty());
                cont++;
                
             }
                     
            }
         }
         
         
         for(int x=0; x<arre.length; x++){
            for (int y=0;y<arre.length; y++) {
                System.out.print(arre[x][y]+ "\t");
            }
            System.out.println("\n");
        }
    }
    
 }
    

