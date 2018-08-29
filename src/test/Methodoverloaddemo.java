/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Gaurav
 */
public class Methodoverloaddemo {
    public static void main(String[]args)
    {
        Md ob1= new Md();
        
        ob1.md(15);
        ob1.setlen(10);
        ob1.md();
    }
}
class Md
{
    int len;
    void setlen(int l)
    {
        len =l;
    }
    
    void md()
    {
       System.out.println("first method"+len);
       //System.out.println("first method");
       
    }
    void md(int a)
    {
        len = a;
       System.out.println("second method"+len);
    }
}