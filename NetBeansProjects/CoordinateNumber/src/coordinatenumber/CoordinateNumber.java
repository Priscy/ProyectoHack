/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinatenumber;

/**
 *
 * @author Priscila
 */
import java.util.Scanner;
public class CoordinateNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int ncasos= tec.nextInt();
        int x;
        int y;
        
       for(int i=0; i<ncasos; i++){
           x=tec.nextInt();
           y=tec.nextInt();
           if(x-y==0|| x-y==2){
               if(x%2==0){
                   System.out.println(x+y);
               } else if( x%2!=0){
                   System.out.println(x+y-1);
               }
           } else if(x==0 && y==0){
               System.out.println(0);
           } else{
               System.out.println("No Number");
           }
           
       }
       
        
        // TODO code application logic here
    }
    
}
/*
6
4 2
6 6
3 4
0 0
3 1
9 7


*/
