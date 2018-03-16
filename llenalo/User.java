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
public class User {
    private int [] has= new int [500];
    private int [] need= new int [500];
    private int [] rep= new int [500];

    public User(int[] has, int[] rep) {
        this.has = has;
        need= new int [has.length];
        for(int i=0;i<has.length-1;i++){
            need[i]=Math.abs(has[i]-1);
        }
        this.rep = rep;
    }

    public User() {
    }
    public void imprime(){
        System.out.println("Estampas que tiene:");
        System.out.print("{ ");
        imp(has,has.length);
        System.out.println(" }");
        System.out.println("Estampas que le falta:");
        System.out.print("{ ");
        imp(need,need.length);
        System.out.println(" }");
        System.out.println("Estampas que tiene repetidas:");
        System.out.print("{ ");
        imp(rep,rep.length);
        System.out.println(" }");
    }
    private static void imp(int [] v, int n){
        if(n==1){
            if(v[0]==1)
                System.out.print("1, ");
        }
        else{
            imp(v,n-1);
            if(v[n-1]==1)
                System.out.print(n+", ");
        }      
    }
    
    public void join(User otro){
        System.out.println("El usuario 1 necesita las siguientes estampas del usuario 2:");
        System.out.print("{ ");
        for (int i=0;i<need.length;i++){
            if(need[i]==otro.rep[i] && need[i]==1 )
                System.out.print(i+1+", ");
        }
        System.out.println("}");
        
        System.out.println("El usuario 2 necesita las siguientes estampas del usuario 1:");
        System.out.print("{ ");
        for (int i=0;i<rep.length;i++){
            if(rep[i]==otro.need[i] && rep[i]==1)
                System.out.print(i+1+", ");
        }
        System.out.println("}");

        
    }
    
    
}
