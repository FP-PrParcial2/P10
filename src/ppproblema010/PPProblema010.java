/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema010;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema010 {
    static String variable="0";
     public static String fibonacci(int contador,int n, int p1, int p2){
         if(contador!=n){
         variable=variable+" , "+p2;
         variable = fibonacci(contador+1,n,p2,p1+p2);
         }
         return variable;
      } 
    public static void main(String[] args) {
          Scanner entrada=new Scanner(System.in);
        System.out.println("ingresa un numero");
        String a="";
        int n=entrada.nextInt();
        if(n>0){
            a=fibonacci(0,n-1,0,1);
            System.out.println(a);
        }
     }
}
    
    
