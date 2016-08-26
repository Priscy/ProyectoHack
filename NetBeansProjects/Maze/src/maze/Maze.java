/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.util.Stack;

/**
 *
 * @author Priscila
 */
public class Maze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f=1;
        int c=0;
        Stack pila = new Stack();
        char [][] arre= {{'x','x','x','x','x','x','x','x','x','x'},
                         {' ',' ','x',' ','x',' ',' ',' ',' ','x'},
                         {'x',' ','x',' ','x',' ','x','x','x','x'},
                         {'x',' ',' ',' ',' ',' ',' ',' ',' ','x'},
                         {'x',' ',' ','x',' ','x',' ',' ',' ','x'},
                         {'x','x','x','x',' ','x',' ','x','x','x'},
                         {'x','x',' ',' ',' ','x',' ',' ',' ',' '},
                         {'x',' ',' ','x','x',' ',' ','x',' ','x'},
                         {'x',' ',' ',' ',' ',' ',' ','x',' ','x'},
                         {'x','x','x','x','x','x','x','x','x','x'} };
        
        for(char[] x: arre){
            for(char y: x){
                System.out.print(y +" ");
            }
            System.out.println("");
        }
        
        do{
            if(arre[f+1][c]==' '){
                pila.push(f*10+c);
                arre[f][c]='y';
                f=f+1;
            }else if(arre[f][c+1]==' '){
                pila.push(f*10+c);
                arre[f][c]='y';
                c=c+1;
            } else if(arre[f-1][c]==' '){
                pila.push(f*10+c);
                arre[f][c]='y';
                f=f-1;
            } else if(arre[f][c-1]==' '){
                pila.push(f*10+c);
                arre[f][c]='y';
                c=c-1;
            } else{
                arre[f][c]='y';
               f=(int)pila.peek()/10;
               c=(int)pila.peek()%10;
               pila.pop();
            }
        
        }while(f!=6 || c!=9);
        pila.push(69);
        System.out.println(pila);
                            
        }
        
    }
    

