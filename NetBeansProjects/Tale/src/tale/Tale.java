/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tale;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Priscila
 */
public class Tale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int f=1;
        int c=0;
        Stack pila = new Stack();
        Queue tale= new LinkedList();
        int [][] arre= {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                        {0,-8,-1,-8,-1,-8,-8,-8,-8,-1},
                        {-1,-8,-1,-8,-1,-8,-1,-1,-1,-1},
                        {-1,-8,-8,-8,-8,-8,-8,-8,-8,-1},
                        {-1,-8,-8,-1,-8,-1,-8,-8,-8,-1},
                        {-1,-1,-1,-1,-8,-1,-8,-1,-1,-1},
                        {-1,-1,-8,-8,-8,-1,-8,-8,-8,-8},
                        {-1,-8,-8,-1,-1,-8,-8,-1,-1,-1},
                        {-1,-8,-8,-8,-8,-8,-8,-1,-8,-1},
                        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1} };
        
        for(int[] x: arre){
            for(int y: x){
                System.out.print(y +" ");
            }
            System.out.println("");
        }
        
        do{
            
            if(arre[f+1][c]==-8){
                tale.offer((f+1)*10+c);
                arre[f+1][c]=arre[f][c]+1;
                
            }if(arre[f][c+1]==-8){
                tale.offer(f*10+(c+1));
                arre[f][c+1]=arre[f][c]+1;
               
            }if(arre[f-1][c]==-8){
                tale.offer((f-1)*10+c);
                arre[f-1][c]=arre[f][c]+1;
                
            }if(c-1<0){
                c=1;
            }
            if(arre[f][c-1]==-8){
                 tale.offer(f*10+(c-1));
                 arre[f][c-1]=arre[f][c]+1;
                   
            }
              
               f=(int)tale.peek()/10;
               c=(int)tale.peek()%10;
               tale.poll();
           
            
        
        }while(f!=6 || c!=9);
        pila.push(69);
        
        do{
            if(arre[f+1][c]==arre[f][c]-1){
                pila.push(f*10+c);
                f=f+1;
            }else 
            if(c+1>9){
                c=8;
            }
            if(arre[f][c+1]==arre[f][c]-1){
                pila.push(f*10+c);
                c=c+1;
            } else if(arre[f-1][c]==arre[f][c]-1){
                pila.push(f*10+c);
                f=f-1;
            } else if(arre[f][c-1]==arre[f][c]-1){
                pila.push(f*10+c);
                c=c-1;
            }
        }while(f!=1 || c!=0);
        
       pila.push(10);
        System.out.println("");
        System.out.println("");
       for(int[] x: arre){
            for(int y: x){
                if(y==-1){
                    System.out.print(" x ");
                }else if(y==-8){
                    System.out.print("   ");
                }else if (y>=10){
                System.out.print(y+" ");
                } else {
                    System.out.print(" "+y+" ");
                }
            }
            System.out.println("");
        }
        System.out.println(pila);
    }
    
    
}
