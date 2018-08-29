/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


class A
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int a)
    {
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
      System.out.println("in B");  
    }
     public B(int a)
    {
        super(a);
        System.out.println("in B int");
    }
}
public class Superdemo1 {
    public static void main(String[] agrs)
    {
    //B objb= new B();
        B objb1=new B(5);
        
}
}
