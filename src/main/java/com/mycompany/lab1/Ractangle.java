

package com.mycompany.lab1;

public class Ractangle {
    double length;
    double width;
    double area,perimeter;
    
    public Ractangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    
    public static void main(String[] args){
            Ractangle x=new Ractangle(100,50);
            x.calculate(100,50);
            
    }
    
    
    public void calculate(double length,double width){
        area=length*width;
        System.out.println("Area="+area);
        perimeter=2*(length+width);
        System.out.println("Perimeter="+perimeter);
    
    }
   
}
