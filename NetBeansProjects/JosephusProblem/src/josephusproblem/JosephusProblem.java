/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephusproblem;

/**
 *
 * @author Priscila
 */

import java.util.LinkedList;
import java.util.Scanner;
public class JosephusProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        LinkedList<Integer> deleted = new LinkedList();
        Scanner tec= new Scanner(System.in);
        int size= tec.nextInt();
        int countOff= tec.nextInt();
        int start= tec.nextInt();
        int tmp=start-1;
        int cont=0;
        boolean var=false;
        for(int i=1; i<=size; i++){
            list.add(i);
        }
       
        do{
          if(cont==0 && (start +countOff>= list.size()+1)){
              tmp++;
              var=true;
              
          }
          for(int i =0; i<countOff; i++){
                if(tmp==list.size()){
                tmp=0;
                }else{
                  tmp++;
                }
          }
            System.out.println(tmp); 
            deleted.add(list.get(tmp));
            list.remove(tmp);
//         if(tmp==0){
//             tmp=list.size();
//         }
            System.out.println(deleted);
            System.out.println(list);
            if(cont==0 && var==true){
              tmp--;
             }
            cont++;
        }while(list.size()!= 1);
        
        System.out.println("Ganador= "+ list);
        System.out.println("Perdedores= "+ deleted);
       
        
    }
    
}
/*
Profesor, por alguna extrana razon solo funciono con los siguientes casos
5
3
1


5
3
2


5
3
3
*/
