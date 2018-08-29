/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

class AA
{
    public void show()
    {
        System.out.println("in class A");
    }
}
class BB extends AA
{
    public void show()                             // step2
    {
        super.show();
        System.out.println("in class B");
    }
}
public class MethodOverRidingDemo {
    public static void main(String[] args)
    {
        BB objb = new BB();
        objb.show();
        
    }
    
}
