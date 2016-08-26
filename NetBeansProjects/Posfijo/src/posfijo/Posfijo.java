/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfijo;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Priscila
 */
public class Posfijo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tec= new Scanner(System.in);
       String entrada= tec.next();
       Stack pila = new Stack();
       String output="";
       char y;
       for(int i=0; i<entrada.length(); i++){
           char x= entrada.charAt(i);
           switch (x){
               case '+':
                case '-':
                 case '/':
                  case '*':
                     pila.push(x);
                      break;
               
                  case '(':
                      pila.push(x);
                      break;
                      
                  case')':
                      do{
                        y=(char) pila.pop();
                        if(y != '('){
                           output+=y;
                        }
                      }while(y=='(');
                   break;
                      
                  default: 
                      output+=x;
                   
              
           }
       }
       
        System.out.println(output);
    }
    
}

/*
(((((a+b)*x)/d)-a)*((r*(x/c))/y))
*/
