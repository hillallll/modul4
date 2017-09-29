/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat4;

/**
 *
 * @author Hillal
 */
public class Shape {
    private String color;
    public Shape (String color){
            this.color=color;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    
    public double getArea(){
        System.out.println("Shape unkown! Cannot compute area!");
        return 0;
    }
}
