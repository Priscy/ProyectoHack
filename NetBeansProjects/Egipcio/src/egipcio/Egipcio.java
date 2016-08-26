/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egipcio;

/**
 *
 * @author Priscila
 */
import java.util.Scanner;
public class Egipcio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner tec= new Scanner(System.in);
//        int p=tec.nextInt();
//        int r=(p*p-p+1);
////        while(p !=0){
//            System.out.println(r);
////            p=tec.nextInt();
////        }
//        
//        int n=tec.nextInt();
//        int f=n-3;
//        int c=0;
//        int i=2;
//        int num=2;
//        System.out.println("Array size: "+ n);
//        int [][]arr = new int [n][n];
//        
//        for(int x=0; x!=r; x++){
//            System.out.println("for");
//            while (f != n-1){
//                System.out.println("while");
//                if(c <= i){
//                    
//                    arr[f][c]=num++;
//                    System.out.println("if"+ "["+f+"]" + "["+c+"]");
//                    c++;
//                    
//                } else{
//                    f++;
//                    System.out.println("else"+ "["+f+"]" + "["+(c-1)+"]" );
//                    arr[f][c]=num++;
//                }
//            }
//            i+=2;
//            f=n-i-1;
//            c=0;
//        }
//         for(int []x :arr){
//            for(int z:x){
//                System.out.print(z+"    ");
//            }
//            System.out.println("");
//        
//        }
//        
//    
        
        Scanner tec= new Scanner(System.in);
        int n=tec.nextInt();
        
        int [][]a= new int[n][n]; 
        a[n-1][0]=1;
      
        
      
        int num=2;
        int fi=0;
        int col=1;
             
        int f=n-3;
        int c=0;
        int i=2;
        
           
            do{
                for(int fila=1;fila<=(col+1);fila++){
                    a[n-fila][col]=num++;
                    fi=n-fila;
                }

                for(int co=col-1; co>=0;co--){
                    a[fi][co]=num++;
                }

               while(f!=n-1 && f>=0){
                if(c<=i){
                    a[f][c]=num++;
                    c++;
                }else{
                    f++;
                    a[f][c-1]=num++;
                }
            }
             i+=2;
            f=n-i-1;
            c=0;
            col+=2;
           }while(col<n);

      
       
          
        
        
        for(int x=0; x<a.length; x++){
            for (int y=0;y<a.length; y++) {
                System.out.print(a[x][y]+ "\t");
            }
            System.out.println("\n");
        }
    
    }
    
    


  
    
}
/*
4

*/
