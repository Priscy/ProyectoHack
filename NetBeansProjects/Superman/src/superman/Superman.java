/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superman;

/**
 *
 * @author Priscila
 */
import java.util.Scanner;
public class Superman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int arr [][]=null;
          captura(arr);
      
    }
        public static void imprimir(int [][]arr){
        for(int []x : arr){
            for(int z:x){
                System.out.print((char)z+" ");
            }
            System.out.println("");
        }
            System.out.println("");
        }
    
        public static void captura(int [][] arr){
         Scanner tec= new Scanner(System.in);
         int nCasos= tec.nextInt();
         int m;
         int n;
         
         for(int i=1; i<=nCasos; i++){
            m=tec.nextInt();
            n=tec.nextInt();
            arr=new int [m][n];
            
            for(int j=0; j<m;j++){
                String temp= tec.next();
                for(int k=0;k<n;k++){
                    arr[j][k]= (int)temp.charAt(k); 
                    
                }
            }
            imprimir(arr);
            Superman x= new Superman();
             System.out.println(x.Scaneo(arr));
            
         }
        }
        
        public int cuentaVecinos(int [][] arr, int f, int c){
            int cont=0;
            if(f-1>=0 && c-1>=0 && arr[f-1][c-1]==(int)'F'){
                cont++;
            }
            if(f-1>=0 &&  arr[f-1][c]==(int)'F'){
                cont++;
            }
            if(f-1>=0 && c+1<arr.length && arr[f-1][c+1]==(int)'F'){
                cont++;
            }
            if( c-1>=0 && arr[f][c-1]==(int)'F'){
                cont++;
            }
            if( c+1<arr.length && arr[f][c+1]==(int)'F'){
                cont++;
            }
            if(f+1<arr.length && c-1>=0 && arr[f+1][c-1]==(int)'F'){
                cont++;
            }
            if(f+1<arr.length &&  arr[f+1][c]==(int)'F'){
                cont++;
            }
            if(f+1<arr.length && c+1<arr.length && arr[f+1][c+1]==(int)'F'){
                cont++;
            }
            return cont;
        }
        
        public String Scaneo (int [][]arr){
            for(int f=0;  f<arr.length; f++){
                for(int c=0; c<arr.length; c++){
                    if(arr[f][c] != (int)'F'){
                        int x=cuentaVecinos(arr,f,c);
                        if(arr[f][c]-48 != x){
                            return "Hiciste mal tu trabajo";
                        }
                    }
                }
            }
            return "Buen Trabajo Superman!!";
        }
}


        
        
//        String []caso= new String[m];
//        char [][]arr = new char[m][n];
//               
//        for (int f=0; f<=m; f++){
//             caso[f]=tec.next();
//                System.out.println(f +".- "+caso[f]);
//            for(int c=0; c<=n; c++){
//                arr[f][c]=caso[f].charAt(c);
//                System.out.println("--"+arr[f][c]);
               
//                String fila= caso[f][c];
//                int num = Integer.parseInt(fila);
//                System.out.println(num);
                
                
            
            
        
        
//        for(char []i :caso){
//            for(char z:i){
//                System.out.print(z+"    ");
//            }
//            System.out.println("Linea Cmbio");
//            
//        
//        }
        
    

/*
3
8 8 
F1012210
1101FF21
121234F1
F2F11F21
12111121
1100012F
F21101F2
12F10111
4 4
FF10
0120
1F10
010F
3 3
111
1F1
111
*/