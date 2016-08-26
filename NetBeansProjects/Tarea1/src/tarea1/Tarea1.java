/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Priscila
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int fila=0;
//        int col=1;
//        int num=0;
//        int cont=0;
//        int F=5;
//        int C=5;
//        int [][] x =new int[F][C];
//       
//         
//           for(int f=0; f<10; f++){
//              
//              if(f==4){
//                   fila=0;
//                   col=2;
//                    x[fila][col]=num+=1;
//                    System.out.print("["+x[fila][col] +"]");   
//               }else if(f==7){
//                   fila=0;
//                   col=3;
//                    x[fila][col]=num+=1;
//                    System.out.print("["+x[fila][col] +"]");   
//               }else if(f==9){
//                   fila=0;
//                   col=4;
//                    x[fila][col]=num+=1;
//                    System.out.print("["+x[fila][col] +"]");  }
//                    else {
//                    x[fila][col]=num+=1;
//                 System.out.print("["+x[fila][col] +"]");   
//                   fila+=1;
//                     col+=1;
//               }
//               cont+=1;
//               if(cont==4){
//                   cont=0;
//                   System.out.println("");
//               }
////               System.out.println("["+ x[0][0]+"]");
//            }
//           
//       
//           
//       }
//    
        
        

//        int a=4;
//        int num=0;
//        int b=4;
//        int y=0;
//        
//        int [][] arre =new int[5][5];
//        for (int x=0; x<=a;x++){
//            for(int x2=0; x2<=b; x2++ ){
//                 arre[x2][x2+y]=num+=1;
//                System.out.print("["+arre[x2][x2+y] +"]");   
//            }
//            y++;
//            b--;
//            System.out.println("");
//        }
        int num=0;
        int [][] arr= new int [5][5];
        for(int d=1; d<=arr.length;d++){
            for(int i=0; i<=(arr.length-d);i++){
                arr[i][i+d-1]=++num;
            }
           }
        for(int []i :arr){
            for(int z:i){
                System.out.print(z+"    ");
            }
            System.out.println("");
        
        }
    }
}
