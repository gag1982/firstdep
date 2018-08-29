/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

abstract class vehicle
{
    abstract public int getnoofwheels();
}

class Bus extends vehicle
{
  /*  public int getnoofwheels()
    {
        return 6;
    }*/
}
 
class Auto extends vehicle
{
    public int getnoofwheels()
    {
        return 3;
    }
}
public class AclassDemo {
    public static void main(String[] args) {
         vehicle v= new Bus();
         System.out.println(v.getnoofwheels());
    }
    
}
