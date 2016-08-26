/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidimensional;

/**
 *
 * @author Priscila
 */
public class Bidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] x=new int[4][4];
        for(int f=0; f<x.length;f++ ){
            for(int c=0; c<x.length;c++){
            x[c][f]=(c*4)+(f+1);
//              x[c][f]=0;
             System.out.print("["+ x[c][f] +"]");
            }
            System.out.println("");
        }
    }
    
}
