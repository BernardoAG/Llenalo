/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenalo;

/**
 *
 * @author bernardoaltamirano
 */
public class Llenalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]={1,1,1,0,1,1,0,0,1,0};
        int b[]={1,1,1,0,0,0,0,0,1,0};
        int c[]={1,0,0,1,1,1,0,0,1,0};
        int d[]={0,1,1,1,0,0,1,0,1,0};
        User u1= new User(a,b);
        User u2= new User(c,d);
    
        u1.imprime();
        System.out.println("");
        u2.imprime();
        System.out.println("");
        u1.join(u2);
    }
    
}
