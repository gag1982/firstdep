/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

//import java.lang.RuntimeException.*;
public class EHMethod {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            
        }
        /*catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
            
        }*/
        finally
        {
            System.out.println("finally ");
        }
    }
    
}
