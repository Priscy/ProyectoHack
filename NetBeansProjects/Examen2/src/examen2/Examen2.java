/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Priscila
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int x1=0;
        int x2=0;
        int x3=0;
        int x4=0;
        int x5=0;
        int col;
        int fil;
        int [][]board= new int[9][9];
       x1=tec.nextInt();
       do {
           do{
            x2=tec.nextInt();
            x3=tec.nextInt();
            x4=tec.nextInt();
            x5=tec.nextInt();
//                if(x1==0){
//                    col=x3;
//                    if(x2==0){
//                      fil=x4;
//                      board[fil][col]=x5;
//                    }else if(x2==1){
//                      fil=x4+3;
//                      board[fil][col]=x5;
//                    }else if(x2==2){
//                      fil=x4+6;
//                      board[fil][col]=x5;
//                    }
//                    
//                }else 
//                if(x1==1){
//                    x3+=3;
//                    col=x3;
//                    if(x2==0){
//                      fil=x4;
//                      board[fil][col]=x5;
//                    }else if(x2==1){
//                      fil=x4+3;
//                      board[fil][col]=x5;
//                    }else if(x2==2){
//                      fil=x4+6;
//                      board[fil][col]=x5;
//                    }
//                }else if(x1==2){
//                    x3+=6;
//                    col=x3;
//                    if(x2==0){
//                      fil=x4;
//                      board[fil][col]=x5;
//                    }else if(x2==1){
//                      fil=x4+3;
//                      board[fil][col]=x5;
//                    }else if(x2==2){
//                      fil=x4+6;
//                      board[fil][col]=x5;
//                    }
//                }
       col= (x1*3)+ x3;
       fil=(x2*3)+x4;
       board[fil][col]=x5;
                
        x1=tec.nextInt();
        } while(x1!=-1 && x1!=-2);
        
       for(int []i :board){
            for(int z:i){
                System.out.print(z+"    ");
            }
            System.out.println("");
        
        }
           System.out.println("");
           System.out.println("");
           
           for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j]=0;
                }
            }
           
        if(x1==-1){x1=tec.nextInt();}
           
       }while(x1!=-2);
    }
}
/*
0 0 0 0 9 
0 0 2 0 4 
0 0 1 1 5 
0 0 0 2 2 
1 0 1 0 8 
1 0 2 0 7 
1 0 0 2 3 
2 0 2 0 1 
2 0 0 1 6 
2 0 1 1 8 
2 0 2 2 9 
0 1 1 0 3 
0 1 2 0 6 
0 1 0 2 5 
0 1 2 2 7 
1 1 0 0 1 
1 1 2 0 5 
1 1 2 1 9 
1 1 0 2 4 
2 1 0 0 2 
2 1 2 0 4 
2 1 1 1 7 
2 1 1 2 3 
2 1 2 2 8 
0 2 0 1 4 
0 2 2 1 9 
0 2 1 2 1 
0 2 2 2 5 
1 2 0 1 6 
1 2 2 2 2 
2 2 2 0 5 
2 2 1 1 1 
2 2 1 2 6 
2 2 2 2 3 
-1
0 0 1 1 5 
1 0 0 0 8 
1 0 0 2 2 
1 0 1 2 3 
0 1 0 0 3 
0 1 0 1 9 
0 1 1 1 6 
0 1 2 2 2 
1 1 0 0 7 
1 1 2 1 8 
2 1 0 0 9 
2 1 1 2 5 
2 1 2 1 7 
2 1 2 2 4 
0 2 0 1 6 
0 2 1 1 7 
0 2 2 2 3 
1 2 0 0 5 
1 2 0 1 4 
1 2 1 2 7 
2 2 0 0 7 
2 2 0 2 2 
2 2 2 0 8 
2 2 2 1 9 
2 2 2 2 6 
-2



*/
