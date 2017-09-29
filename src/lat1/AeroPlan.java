/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat1;

/**
 *
 * @author Hillal
 */
public class AeroPlan extends Vehicle{
    public void walk(){
        System.out.println("AeroPlan is Falying");
    }
    public static void main(String []args){
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
    
}
