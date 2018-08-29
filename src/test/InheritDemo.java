/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Calculator
{
    public int  add(int i, int j)
    {
        return i+j;
        
    }
}

class advcal extends Calculator 
{
     public int  sub(int i, int j)
    {
        return i-j;
        
    }
}
class vadvcal extends advcal
{
public int  mul(int i, int j)
    {
        return i*j;
        
    }
}
public class InheritDemo {
    public static void main(String[] args)
    {
        advcal c1=new advcal();
        System.out.println(c1.add(5, 6));
        vadvcal vbobj = new vadvcal();
        System.out.println(vbobj.add(5, 6));
        System.out.println(vbobj.mul(5, 6));
        
    }
    
}
