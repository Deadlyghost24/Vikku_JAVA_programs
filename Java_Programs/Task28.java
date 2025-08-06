package com.vikku;


interface Shape5 {
    void area();
}

class Circle1 implements Shape5{
    double radius = 5;

    public void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle implements Shape5 {
    int length = 4, breadth = 5;

    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    
public class Task28 {
	
	    public static void main(String[] args) {
	        Shape5 c = new Circle1();
	        Shape5 r = new Rectangle();
	        c.area();
	        r.area();
	    }
	}

}
