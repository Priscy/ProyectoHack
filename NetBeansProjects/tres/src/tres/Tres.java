/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

/**
 *
 * @author Priscila
 */
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean [] arr= new boolean[300];
      
        for(int i=0; i<arr.length; i++){
            arr[i]=true;
        }
        arr[1]=true;
        
        for(int i=2;i<arr.length;i++){
            if(arr[i]==true){
                for(int j=i+i; j<arr.length; j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=1; i<arr.length;i++){
//            if(arr[i]==true){
//                System.out.println("El numero "+i+ " es primo.");
//            }
           System.out.println(arr[i]==true ? "El numero " +i+" es primo." : "No"); 
        }
        // TODO code application logic here
    }
    
}
