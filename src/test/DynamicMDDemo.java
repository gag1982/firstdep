/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class AA
{
    public void show()
    {
        System.out.println("in class A");
    }
}
class BB extends AA
{
    public void show()                             
    {
        
        System.out.println("in class B");
    }
    /*
    public void dem()
    {
        System.out.println("in method dem");
    }
*/
}

//another class CC extending AA


public class DynamicMDDemo {
    public static void main(String[] args)
    {
        AA objb = new BB();
        objb.show();
        //objb.dem();
        
        
    }
    
}
